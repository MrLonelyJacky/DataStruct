package list;

import java.util.Iterator;

/**
 * the interface extends iterable for foreach
 *
 * @param <T>
 */
public interface MyCollection<T> extends Iterable<T> {
    /**
     * get  size
     * @return
     */
    int size();

    /**
     * check isEmpty
     * @return
     */
    boolean isEmpty();

    /**
     * clear the collection
     */
    void clear();

    /**
     * check is contains param t
     * @param t
     * @return
     */
    boolean contains(T t);

    /**
     * add element t
     * @param t
     * @return
     */
    boolean add(T t);

    /**
     * remove element t
     * @param t
     * @return
     */
    boolean remove(T t);

    /**
     * get the iterator
     * @return
     */
    Iterator<T> iterator();
}
