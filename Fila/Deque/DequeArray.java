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
        inicio = (inicio - 1 + capacidade) % capacidade;
        arr[inicio] = o; //coloca o valor novo
        size++;
    }

    public void insertLast(Object o){
        arr[fim] = o;
        fim = (fim + 1) % capacidade; //a ordem importa e precisa ficar circular para nao ficar negativo
        size++;

    }

    public Object removeFirst() throws DequeVazia{
        if (isEmpty()){
            throw new DequeVazia("Deque está vazia!");
        }

        Object valor = arr[inicio];
        inicio = (inicio + 1) % capacidade;
        size--;
        return valor;
    }

    public Object removeLast() throws DequeVazia{
        if (isEmpty()){
            throw new DequeVazia("Deque está vazia!");  
        }

        fim = (fim - 1 + capacidade) % capacidade;
        Object valor = arr[fim];
        size--;
        return valor;

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

        return arr[(fim - 1 + capacidade) % capacidade];
        //está de forma circular e o fim pode estar qualquer canto do array e passar, entao preciso frisar para dar uma volta
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }
}
