package com.aliouswang.butterknife.runtime.internal;

import java.util.AbstractList;
import java.util.RandomAccess;

/**
 * An immutable list of views which is lighter than {@code Collections.unmodifiableList}
 * @param <T>
 */
public final class ImmutableList<T> extends AbstractList<T> implements RandomAccess {

    private final T[] items;

    ImmutableList(T[] items) {
        this.items = items;
    }

    @Override
    public T get(int index) {
        return items[index];
    }

    @Override
    public int size() {
        return items.length;
    }

    @Override
    public boolean contains(Object o) {
        for (T item : items) {
            if (item == o) {
                return true;
            }
        }
        return false;
    }
}
