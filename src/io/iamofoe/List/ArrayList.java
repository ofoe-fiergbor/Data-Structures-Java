package io.iamofoe.List;

import java.util.Arrays;
import java.util.Collection;

public class ArrayList<T> implements List<T> {
    private final int INITIAL_LENGTH = 10;
    private final int INITIAL_SIZE = 0;

    private Object[] array;
    private int length;
    private int arraySize;

    public ArrayList() {
        this.arraySize = INITIAL_SIZE;
        this.length = INITIAL_LENGTH;
        this.array = new Object[length];
    }

    public ArrayList(int length) {
        this.arraySize = INITIAL_SIZE;
        this.length = length;
        this.array = new Object[length];
    }

    @Override
    public boolean add(T element) {
        add(size(), element);
        return true;
    }

    @Override
    public void add(int index, T element) {
        if (size() == length - 1) {
            int newLength = length * 2;
            Object[] newArray = new Object[newLength];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[index] = element;
        arraySize++;
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        for (T item : collection) {
            add(item);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> collection) {
        outOfBoundCheck(index, size());
        int position = index;
        for (T item : collection) {
            add(position, item);
            position++;
        }
        return true;
    }


    @Override
    public void clear() {
        //TODO
        array = new Object[length];
    }

    @Override
    public boolean contains(Object object) {
        for (Object o : array) {
            if (o == object) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        for (Object object : collection) {
            if (!contains(object)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public T get(int index) {
        outOfBoundCheck(index, size());
        return (T) array[index];
    }

    @Override
    public int indexOf(Object object) {
        if (object == null) {
            throw new NullPointerException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == object) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int lastIndexOf(Object object) {
        for (int i = size() - 1; i >=0 ; i--) {
            if (array[i] == object){
                return i;
            }
        }
        return -1;
    }

    @Override
    public T remove(int index) {
        outOfBoundCheck(index, size());
        Object[] newArray = new Object[size()];
        T result = null;
        for (int i = 0, k = 0; i < size(); i++) {
            if (i == index) {
                result = (T) array[i];
            } else {
                newArray[k] = array[i];
                k++;
            }
        }
        array = newArray;
        return result;
    }

    @Override
    public boolean remove(Object object) {
        if (!contains(object)) return false;
        Object[] newArray = new Object[size()];
        boolean removed = false;
        for (int i = 0, k = 0; i < size(); i++) {
            if (!removed && array[i] == object) {
                removed = true;
            } else {
                newArray[k] = array[i];
                k++;
            }
        }
        array = newArray;
        return removed;
    }


    @Override
    public T set(int index, T element) {
        outOfBoundCheck(index, size());
        array[index] = element;
        return element;
    }

    @Override
    public int size() {
        return arraySize;
    }


    private void outOfBoundCheck(int index, int size) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
}
