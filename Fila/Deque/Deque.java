package Fila.Deque;

public interface Deque {
    void insertFirst(Object o);
    void insertLast(Object o);
    Object removeFirst() throws DequeVazia;
    Object removeLast() throws DequeVazia;
    Object first() throws DequeVazia;
    Object last() throws DequeVazia;
    int size();
    boolean isEmpty();
}
