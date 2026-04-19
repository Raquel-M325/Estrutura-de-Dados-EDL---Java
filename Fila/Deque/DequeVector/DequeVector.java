package Fila.Deque.DequeVector;

public interface DequeVector {
    void insertFirst(Object o);
    void insertLast(Object o);
    Object removeFirst() throws DequeVectorVazia;
    Object removeLast() throws DequeVectorVazia;
    Object last() throws DequeVectorVazia;
    Object first() throws DequeVectorVazia;
    int size();
    boolean isEmpty();
}
