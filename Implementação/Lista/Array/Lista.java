package Implementação.Lista.Array;

public interface Lista {
    boolean isFirst(int i);
    boolean isLast(int i);
    Object first();
    Object last();
    Object before(int i);
    Object after(int i);
    Object replaceElement(int i, Object o);
    void swapElements(int i, int j);
    void insertBefore(int i, Object o);
    void insertAfter(int i, Object o);
    void insertFirst(Object o);
    void insertLast(Object o);
    Object remove(int i);
    int size();
    boolean isEmpty();
}
