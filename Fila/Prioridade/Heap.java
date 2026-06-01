package Fila.Prioridade;

public class Heap implements Position {

    private int size;
    private int capacidade;
    private Item[] arr;

    public Heap(int capacidade){
        this.capacidade = capacidade;
        this.size = 0;
        arr = new Item[capacidade];
    }


    public void insert(int key, Object o){

        if (size == capacidade){
            grow();
        }

        arr[size] = new Item(key, o);
        size++;

        upHeap();
    }

    public void removeMin() throws InvalidPositionExceptionHeap{

        if (isEmpty()){
            throw new InvalidPositionExceptionHeap("Heap vazia");
        }

        arr[0] = arr[size - 1];
        arr[size - 1] = null;

        size--;

        if (!isEmpty()){
            downHeap();
        }
    }

    public Item min() throws InvalidPositionExceptionHeap{

        if (isEmpty()){
            throw new InvalidPositionExceptionHeap("Heap vazia");
        }

        return arr[0];
    }

    private void upHeap(){

        int i = size - 1;
        while (i > 0){

            int pai = (i - 1) / 2;

            if (arr[i].getKey() >= arr[pai].getKey()){
                break;
            }

            swap(i, pai);
            i = pai;
        }
    }

    private void downHeap(){

        int i = 0;

        while (true){
            int esq = 2 * i + 1;
            int dir = 2 * i + 2;
            int menor = i;

            if (esq < size &&
                arr[esq].getKey() < arr[menor].getKey()){
                menor = esq;
            }

            if (dir < size &&
                arr[dir].getKey() < arr[menor].getKey()){
                menor = dir;
            }

            if (menor == i){
                break;
            }

            swap(i, menor);

            i = menor;
        }
    }

    private void grow(){

        capacidade *= 2;

        Item[] novo = new Item[capacidade];

        for (int i = 0; i < size; i++){
            novo[i] = arr[i];
        }

        arr = novo;
    }


    private void swap(int i, int j){

        Item temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}