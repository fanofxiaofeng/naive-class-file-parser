package com.study.type;

import com.study.io.BasicInputStream;
import com.study.type.constant.CpInfo;
import com.study.type.constant.leaf.ConstantDouble;
import com.study.type.constant.leaf.ConstantLong;
import com.study.type.constant.ConstantPoolFactory;
import com.study.util.ConstantPoolUtils;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Iterator;
import java.util.Optional;

public class ConstantPool implements Iterable<Pair<Integer, CpInfo>> {

    private final U2 count;

    private final CpInfo[] items;

    public CpInfo get(int i) {
        return items[i];
    }

    public CpInfo get(U2 u2) {
        return get(u2.toInt());
    }

    public U2 getCount() {
        return count;
    }

    private ConstantPool(U2 count, CpInfo[] items) {
        this.count = count;
        this.items = items;
    }

    @Override
    public Iterator<Pair<Integer, CpInfo>> iterator() {
        return new Iterator<>() {
            int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return nextIndex() < items.length;
            }

            private int nextIndex() {
                if (ConstantPoolUtils.occupyOneSlot(items[currentIndex])) {
                    return currentIndex + 1;
                }
                return currentIndex + 2;
            }

            @Override
            public Pair<Integer, CpInfo> next() {
                int nextIndex = nextIndex();
                currentIndex = nextIndex;
                return Pair.of(nextIndex, items[nextIndex]);
            }
        };
    }

    public static class Builder {
        public ConstantPool build(U2 count, BasicInputStream basicInputStream) {
            CpInfo[] items = new CpInfo[count.toInt()];
            for (int i = 1; i < count.toInt(); i++) {
                items[i] = ConstantPoolFactory.build(basicInputStream);

                if (!occupyOneSlot(items[i])) {
                    i++;
                }
            }

            return new ConstantPool(count, items);
        }

        private boolean occupyOneSlot(CpInfo constant) {
            return !(constant instanceof ConstantDouble) &&
                    !(constant instanceof ConstantLong);
        }
    }

    public Optional<String> detail(U2 index) {
        return get(index).detail(this);
    }
}
