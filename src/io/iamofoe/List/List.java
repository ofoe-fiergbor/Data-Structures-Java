package io.iamofoe.List;

import java.util.Collection;

public interface List<T> {

    /**
     * Appends the specified element to the end of this list (optional operation).
     *
     * @param element
     * @return boolean
     */
    boolean add(T element);

    /**
     * Inserts the specified element at the specified position in this list (optional operation)
     *
     * @param index
     * @param element
     */
    void add(int index, T element);

    /**
     * Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator (optional operation).
     *
     * @param collection
     * @return boolean
     */
    boolean addAll(Collection<? extends T> collection);

    /**
     * Inserts all the elements in the specified collection into this list at the specified position (optional operation).
     *
     * @param index
     * @param collection
     * @return boolean
     */
    boolean addAll(int index, Collection<? extends T> collection);

    /**
     * Removes all of the elements from this list (optional operation).
     */
    void clear();

    /**
     *Returns true if this list contains the specified element.
     * @param object
     * @return boolean
     */
    boolean contains(Object object);

    /**
     * Return true is this list contains all the elements of the specified collection.
     * @param collection
     * @return boolean
     */
    boolean containsAll(Collection<?> collection);

    /**
     * Returns the element at the specified position in this list.
     * @param index
     * @return T
     */
    T get(int index);

    /**
     * Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
     * @param object
     * @return int
     */
    int indexOf(Object object);

    /**
     * Returns true is this list contains no elements.
     * @return boolean
     */
    boolean isEmpty();

    /**
     * Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
     * @param object
     * @return int
     */
    int lastIndexOf(Object object);

    /**
     * Removes the element at the specified position in this list (optional operation).
     * @param index
     * @return T
     */
    T remove(int index);

    /**
     * Removes the first occurrence of the specified element from this list, if it is present(optional operation).
     * @param object
     * @return boolean
     */
    boolean remove(Object object);


    /**
     * Replaces the element at the specified position in this list with the specified element (optional operation).
     * @param index
     * @param element
     * @return T
     */
    T set(int index, T element);

    /**
     * Returns the number of elements in this list.
     * @return int
     */
    int size();

}
