package Implementação.Lista.Array;

public class ListaArray implements Lista {
    private Object[] arr;
    private int capacidade, size, inicio, fim;

    public ListaArray(int capacidade){
        this.capacidade = capacidade;
        this.size = 0;
        arr = new Object[capacidade];
        this.inicio = 0;
        this.fim = 0;

    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFirst(int i){

    }

    public boolean isLast(int i){

    }

    public void insertFirst(Object o){

    }

    public void insertLast(Object o){
        
    }

    public void insertBefore(int i, Object o){

    }

    public void insertAfter(int i, Object o){

    }

    public void swapElements(int i){

    }

    public Object remove(int i){

    }

    public Object first(){

    }

    public Object last(){

    }

    public Object before(int i){

    }

    public Object after(int i){

    }

    public Object replaceElements(int i, Object o){

    }
    
}
