package Fila;

public interface Fila{
    public abstract void enqueue(Object o);
    public abstract int size();
    public abstract boolean isEmpty();
    public abstract Object dequeue();
}