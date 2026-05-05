package Implementação.Lista.Array;

public class ListaArray implements Lista {
    private Object[] arr;
    private int capacidade, size, inicio;

    public ListaArray(int capacidade){
        this.capacidade = capacidade;
        this.size = 0;
        arr = new Object[capacidade];
        this.inicio = 0;

    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFirst(int i){ //é boolean, do qual se fosse aquela forma no object daria errada por ser elemento
        return i == inicio;
    }
    
    public boolean isLast(int i){
        return i == size() - 1;
    }

    public void insertFirst(Object o){
        if (capacidade == size()){
            grow();
        }

        for (int i = size(); i > inicio; i--){
            arr[i] = arr[i - 1]; //deslocou
        }

        arr[inicio] = o; //inseriu
        size++;
    }

    public void insertLast(Object o){
        if (capacidade == size()){
            grow();
        }

        arr[size()] = o;
        size++;
    }

    public void insertBefore(int i, Object o){
        if (capacidade == size()){
            grow();
        }

        if (i == inicio){
            insertFirst(o);            
            return;
        }

        for (int r = size(); r > i; r--){
            arr[r] = arr[r - 1];
        }

        arr[i] = o;
        size++;
    }

    public void insertAfter(int i, Object o){
        if (capacidade == size()){
            grow();
        }

        if (i == size() - 1){
            insertLast(o);
            return;
        }

        for (int r = size(); r > i + 1; r--){
            arr[r] = arr[r - 1];
        }

        arr[i + 1] = o;
        size++;
    }

    public void swapElements(int i, int j) throws ListaVazia{
        if (isEmpty()){
            throw new ListaVazia("Lista Vazia, não dá para trocar elemento!");
        }

        Object valor = arr[i]; //valor temporario para salvar
        arr[i] = arr[j];
        arr[j] = valor;
    }

    public Object remove(int i) throws ListaVazia{
        if (isEmpty()){
            throw new ListaVazia("Lista Vazia!");
        }

        Object remover = arr[i];

        for (int r = i; r < size() - 1; r++){
            arr[r] = arr[r + 1];
        }

        size--;
        return remover;

    }

    public Object first(){
        return arr[inicio]; //retorna como object
    }

    public Object last(){
        return arr[size() - 1];

    }

    public Object before(int i) throws ListaVazia{
        if (i == inicio){
            throw new ListaVazia("Não há elemento antes de inicio!");
        }

        return arr[i - 1];
    }

    public Object after(int i) throws ListaVazia{
        if (i == size() - 1){
            throw new ListaVazia("Não há elemento depois do fim!");
        }

        return arr[i + 1];
    }

    public Object replaceElement(int i, Object o) throws ListaVazia{
        if (isEmpty()){
            throw new ListaVazia("Lista Vazia!");
        }

        Object antigo = arr[i];
        arr[i] = o; //substitui 
        return antigo;

    }
    
    public void grow(){
        int nova_capacidade = capacidade * 2;
        Object[] novo_arr = new Object[nova_capacidade];

        for (int i = 0; i < size(); i++){
            novo_arr[i] = arr[i];
        }

        arr = novo_arr;
        capacidade = nova_capacidade;
    }
}
