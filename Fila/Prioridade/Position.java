package Fila.Prioridade;
public interface Position{
    int size();
    boolean isEmpty();
    void insert(Object o) throws InvalidPositionExceptionHeap;
    void removeMin(Object Objectde) throws InvalidPositionExceptionHeap;
    Object min(Object Objectde) throws InvalidPositionExceptionHeap;
    void upHeap();
}