package Stack;

/**
 * Interface for stacks implementations
 * @param <E> the data type of the generic Stack
 */

public interface StackInterface<E> {

    /**
     * Tests if this stack is empty.
     * @return true if and only if this stack contains no items;
     *         false otherwise.
     */
    public Boolean empty();

    public E peek();

    E pop();

    int search(E element);

}
