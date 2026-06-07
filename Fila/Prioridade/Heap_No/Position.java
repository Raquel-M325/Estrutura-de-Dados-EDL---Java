package Fila.Prioridade.Heap_No;

public interface Position {
    void insert(Object elemento, int key);
    void swap(No node1,No node2) throws InvalidPositionExceptionHeapNo;
    int size();
    boolean isEmpty();
    void upheap(No node) throws InvalidPositionExceptionHeapNo;
    void downheap(No node) throws InvalidPositionExceptionHeapNo;
    No min() throws InvalidPositionExceptionHeapNo;
    void removeMin() throws InvalidPositionExceptionHeapNo;    
    No getRoot() throws InvalidPositionExceptionHeapNo;
}