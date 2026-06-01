package Fila.Prioridade;
public class Heap implements Position{
    private int size;
    private Object[] arr;
    

    public Heap(){
        this.size = 0;
        arr = new Object[0];
    }

    public void upHeap(){
        while (key > min()){

        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void insert(int key, Object o) throws InvalidPositionExceptionHeap{
        arr[] =
        Object novo = new Object;
        novo.setElement(o);

        size++;
    }

    public void removeMin(Object o) throws InvalidPositionExceptionHeap{
        if (isEmpty()){
            throw new InvalidPositionExceptionHeap("Está vazia");
        }

        if (min()){
            //removera esse minimo
        }
       
        size--;
        
    }

    public Object min() throws InvalidPositionExceptionHeap{
        if (isEmpty()){
            throw new InvalidPositionExceptionHeap("Está vazia");
        }

        int menor = 10000; //precisa corrigir
        if (key < menor){
            menor = key;
        }

        return menor;
    }
}