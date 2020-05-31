package list;

/**
 * list collection  one of collection
 * the list has two main implementation modes
 * one is based on array  another is based on linkedList
 */
public interface MyList<T> extends MyCollection<T> {
    /**
     * get element by index
     * @param index
     * @return
     */
    T get(int index);

    /**
     * set element by index
     * @param index
     * @param t
     * @return
     */
    T set(int index, T t);

    /**
     * add element by index
     * @param index
     * @param t
     */
    void add(int index, T t);

    /**
     * remove element by index
     * @param index
     */
    void  remove(int index);

    //TODO a method for geting a listIterator
}
