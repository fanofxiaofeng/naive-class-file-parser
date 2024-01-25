package com.study.type;

import com.study.type.constant.CpInfo;
import com.study.type.constant.compound.CompoundCpInfo;
import com.study.type.constant.leaf.LeafCpInfo;
import com.study.util.ConstantPoolUtils;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Iterator;

public class ConstantPool implements Iterable<Pair<Integer, CpInfo>> {

    private final int count;

    private final CpInfo[] items;

    public CpInfo get(int i) {
        return items[i];
    }

    public CpInfo get(U2 u2) {
        return get(u2.toInt());
    }

    public <T extends CpInfo> T get(U2 u2, Class<T> expectedClass) {
        CpInfo cpInfo = get(u2);
        if (expectedClass.isAssignableFrom(cpInfo.getClass())) {
            return (T) cpInfo;
        }

        String message =
                String.format("expectedClass is: %s, but real class is: %s, please check!",
                        expectedClass.getSimpleName(),
                        cpInfo.getClass().getSimpleName()
                );
        throw new IllegalArgumentException(message);
    }

    public int getCount() {
        return count;
    }

    public ConstantPool(int count, CpInfo[] items) {
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

    public String detail(U2 index) {
        return get(index, CompoundCpInfo.class).detail(this);
    }

    public String desc(U2 index) {
        return get(index, LeafCpInfo.class).desc();
    }

    public int lastIndex() {
        int count = getCount();
        int lastIndex = count - 1;
        if (get(count - 1) == null) {
            lastIndex--;
        }
        return lastIndex;
    }
}
