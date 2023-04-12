
package collectionsjava;

/**
 * List interface.
 *
 * @param <E> the type of elements in this list
 */
public interface List<E> {
    /**
     * Add an element at the specified index.
     * @param index the index at which the specified element is to be inserted
     * @param element element to be inserted
     */
    void add(int index, E element);

    /**
     * Add an element at the end of the list.
     * @param e element to be added
     * @return true if the element was added
     */
    boolean add(E e);

    /**
     * Get the element at the specified index.
     * @param index index of the element to return
     * @return the element at the specified index
     */
    E get(int index);

    /**
     * Check if the list is empty.
     * @return true if the list is empty
     */
    boolean isEmpty();

    /**
     * Remove the element at the specified index.
     * @param index the index of the element to be removed
     * @return the element that was removed from the list
     */
    E remove(int index);

    /**
     * Get the size of the list.
     * @return the number of elements in this list
     */
    int size();

    /**
     * Replace the element at the specified index.
     * @param index index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     */
    E set(int index, E element);
}
