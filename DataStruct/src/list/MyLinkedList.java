package list;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @version: V1.0
 * @author: Min.Cai
 * @description: MyLinkedList is base Linked to create List
 * MyLinkedList implements MyList，cloneable,Serializable interface
 * @data: date 2020/5/31 23:26
 **/
public class MyLinkedList<E> implements MyList<E>, Cloneable, Serializable {


    /**
     * MyLinkedList support Node
     *
     * @param <E>
     */
    private static class Node<E> {
        E item;
        MyLinkedList.Node<E> next;
        MyLinkedList.Node<E> prev;

        Node(MyLinkedList.Node<E> prev, E element, MyLinkedList.Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    /**
     * Constructs an empty list.
     */
    public MyLinkedList() {
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E e) {
        return null;
    }

    @Override
    public void add(int index, E e) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(E e) {
        return false;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean remove(E e) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
