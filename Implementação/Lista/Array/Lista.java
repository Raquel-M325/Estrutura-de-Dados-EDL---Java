package Implementação.Lista.Array;

public interface Lista {
    boolean isFirst(int i);
    boolean isLast(int i);
    Object first();
    Object last();
    Object before(int i) throws ListaVazia;
    Object after(int i) throws ListaVazia;
    Object replaceElement(int i, Object o) throws ListaVazia;
    void swapElements(int i, int j) throws ListaVazia;
    void insertBefore(int i, Object o);
    void insertAfter(int i, Object o);
    void insertFirst(Object o);
    void insertLast(Object o);
    Object remove(int i) throws ListaVazia;
    int size();
    boolean isEmpty();
    void grow();
}
