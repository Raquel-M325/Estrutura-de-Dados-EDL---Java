package Fila.Deque;

public class DequeArray implements Deque {
    
    private Object[] arr;
    private int capacidade, inicio, fim, size;
    
    public DequeArray(int capacidade){
        this.capacidade = capacidade;
        this.inicio = 0;
        this.fim = 0;
        arr = new Object[capacidade];
    }

    public void insertFirst(Object o){
        
        size++;
    }

    public void insertLast(Object o){

        size++;

    }

    public Object removeFirst() throws DequeVazia{
        if (isEmpty()){
            throw new DequeVazia("Deque está vazia!");
        }

        size--;
    }

    public Object removeLast() throws DequeVazia{
        if (isEmpty()){
            throw new DequeVazia("Deque está vazia!");  
        }

        size--;

    }

    public Object first() throws DequeVazia{
        if (isEmpty()){
            throw new DequeVazia("Deque está vazia!");
        }

        return arr[inicio]; //quero o elemento, por isso está dentro de uma lista
    }

    public Object last() throws DequeVazia{
        if (isEmpty()){
            throw new DequeVazia("Deque está vazia!");
        }

        return arr[fim - 1]; //ficar sempre no final
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }
}
