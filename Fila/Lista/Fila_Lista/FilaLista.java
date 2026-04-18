package Fila.Lista.Fila_Lista;

public interface FilaLista {
    public void enqueue(Object elemento);
    public Object dequeue() throws FilaListaVazia;
    public boolean isEmpty();
    public int size();
}
