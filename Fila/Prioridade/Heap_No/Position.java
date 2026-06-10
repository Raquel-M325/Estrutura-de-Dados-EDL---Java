package Fila.Prioridade.Heap_No;

public interface Position {

    void insert(Object elemento, int key) throws InvalidPositionExceptionHeapNo;
    void swap(No node1, No node2) throws InvalidPositionExceptionHeapNo;
    int size();
    boolean isEmpty();
    void upheap(No node) throws InvalidPositionExceptionHeapNo;
    void downheap(No node) throws InvalidPositionExceptionHeapNo;
    No min() throws InvalidPositionExceptionHeapNo;
    void removeMin() throws InvalidPositionExceptionHeapNo;
    No getRoot() throws InvalidPositionExceptionHeapNo;
    No getLastNode() throws InvalidPositionExceptionHeapNo;
    No getInsertionPosition() throws InvalidPositionExceptionHeapNo;
    boolean hasLeft(No node) throws InvalidPositionExceptionHeapNo;
    boolean hasRight(No node) throws InvalidPositionExceptionHeapNo;
    boolean isRoot(No node) throws InvalidPositionExceptionHeapNo;
}