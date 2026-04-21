package Fila.Deque;

public class DequeArray implements Deque {
    
    private Object[] arr;
    private int capacidade, inicio, fim, size, menor;
    
    public DequeArray(int capacidade){
        this.capacidade = capacidade;
        this.inicio = 0;
        this.fim = 0;
        arr = new Object[capacidade];
    }

    public void insertFirst(Object o){
        inicio = (inicio - 1 + capacidade) % capacidade;
        arr[inicio] = o; //coloca o valor novo

        int elemento = (int)o;
        if (isEmpty() || menor > elemento){
            menor = elemento;
        }

        size++;
    }

    public void insertLast(Object o){
        arr[fim] = o;
        fim = (fim + 1) % capacidade; //a ordem importa e precisa ficar circular para nao ficar negativo
        
        int elemento = (int)o;
        if (size == 0 || menor > elemento){
            menor = elemento;
        }

        size++;

    }

    public Object removeFirst() throws DequeVazia{
        if (isEmpty()){
            throw new DequeVazia("Deque está vazia!");
        }

        Object valor = arr[inicio];
        inicio = (inicio + 1) % capacidade;

        size--;

        if (!isEmpty()){
            menor = (int)arr[inicio];
            for (int i = inicio; i != fim; i = (i + 1) % capacidade){
                if (menor > (int)arr[i]){
                    menor = (int)arr[i];
                }
            }
        }

        return valor;
    }

    public Object removeLast() throws DequeVazia{
        if (isEmpty()){
            throw new DequeVazia("Deque está vazia!");  
        }

        fim = (fim - 1 + capacidade) % capacidade;
        Object valor = arr[fim];
        size--;

        if (!isEmpty()){
            menor = (int)arr[inicio];
            for (int i = inicio; i != fim; i = (i + 1) % capacidade){
                if (menor > (int)arr[i]){
                    menor = (int)arr[i];
                }
            }
        }
        
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

    public Object acessarMenor() throws DequeVazia{
        if (isEmpty()) {
            throw new DequeVazia("Deque está sem elementos");
        }

        return menor;
    }
}
