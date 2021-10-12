package datastructures;

import java.util.Collection;
import java.util.Iterator;

public class Queue<E> implements java.util.Queue<E> {

    /**
     * Following methods are mandatory to implement
     * - add
     * - offer
     * - remove
     * - poll
     * - element
     * - peek
     * - isEmpty
     */

    @Override
    public boolean add(E e) {
        //TODO implement here!
        return false;
    }

    @Override
    public boolean offer(E e) {
        //TODO implement here!
        return false;
    }

    @Override
    public E remove() {
        //TODO implement here!
        return null;
    }

    @Override
    public E poll() {
        //TODO implement here!
        return null;
    }

    @Override
    public E element() {
        //TODO implement here!
        return null;
    }

    @Override
    public E peek() {
        //TODO implement here!
        return null;
    }

    @Override
    public boolean isEmpty() {
        //TODO implement here!
        return false;
    }

    /**
     * Following methods are optional to implement
     */

    @Override
    public int size() {
        return 0;
    }


    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
