package com.study.type;

import com.study.io.BasicInputStream;
import com.study.type.constant.AbstractConstant;
import com.study.type.constant.ConstantDouble;
import com.study.type.constant.ConstantLong;
import com.study.type.constant.ConstantPoolFactory;
import com.study.util.ConstantPoolUtils;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Iterator;

public class ConstantPool implements Iterable<Pair<Integer, AbstractConstant>> {

    private final U2 count;

    private final AbstractConstant[] items;

    public AbstractConstant get(int i) {
        return items[i];
    }

    public AbstractConstant get(U2 u2) {
        return get(u2.toInt());
    }

    public U2 getCount() {
        return count;
    }

    private ConstantPool(U2 count, AbstractConstant[] items) {
        this.count = count;
        this.items = items;
    }

    @Override
    public Iterator<Pair<Integer, AbstractConstant>> iterator() {
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
            public Pair<Integer, AbstractConstant> next() {
                int nextIndex = nextIndex();
                currentIndex = nextIndex;
                return Pair.of(nextIndex, items[nextIndex]);
            }
        };
    }

    public static class Builder {
        public ConstantPool build(U2 count, BasicInputStream basicInputStream) {
            AbstractConstant[] items = new AbstractConstant[count.toInt()];
            for (int i = 1; i < count.toInt(); i++) {
                items[i] = ConstantPoolFactory.build(basicInputStream);

                if (!occupyOneSlot(items[i])) {
                    i++;
                }
            }

            return new ConstantPool(count, items);
        }

        private boolean occupyOneSlot(AbstractConstant constant) {
            return !(constant instanceof ConstantDouble) &&
                    !(constant instanceof ConstantLong);
        }
    }
}
