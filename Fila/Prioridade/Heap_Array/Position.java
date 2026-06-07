package Fila.Prioridade.Heap_Array;

public interface Position {
    int size();
    boolean isEmpty();
    void insert(int key, Object o);
    void removeMin() throws InvalidPositionExceptionHeap;
    Item min() throws InvalidPositionExceptionHeap;
}