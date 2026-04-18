package Fila.Vector;

public interface FilaVector {
    public void enqueue(Object o);
    public Object dequeue() throws FilaVectorVazia;
    public int size();
    public boolean isEmpty();
}
