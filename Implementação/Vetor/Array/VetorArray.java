package Implementação.Vetor.Array;

public class VetorArray implements Vetor{
    private Object[] arr;
    private int capacidade, size;

    public VetorArray (int capacidade){
        this.capacidade = capacidade;
        this.size = 0;
        arr = new Object[capacidade];
    }

    public Object elemAtRank(int r) throws VetorVazia{
        if (isEmpty()){
            throw new VetorVazia("Vetor array está vazia");
        }

        return arr[r];
    }

    public Object replaceAtRank(int r, Object o) throws VetorVazia{
        if (isEmpty()){
            throw new VetorVazia("Vetor array está vazia");
        }

        Object substitui = arr[r]; //reserva o valor do indice
        arr[r] = o; //troca o elemento do indice diretamente
        return substitui;

    }

    public void insertAtRank(int r, Object o){
        if (capacidade == size()){
            grow();
        }

        for (int i = size(); i > r; i--){
            arr[i] = arr[i - 1];
        }

        arr[r] = o;
        size++;
        
    }

    public Object removeAtRank(int r) throws VetorVazia{
        if (isEmpty()){
            throw new VetorVazia("Vetor array está vazia");
        }

        Object removi = arr[r];

        for (int i = r; i < size() - 1; i++){
            arr[i] = arr[i + 1]; //move o elemento 
        }

        size--;
        return removi;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void grow(){
        int nova_capacidade = capacidade * 2;
        Object[] novo_arr = new Object[nova_capacidade];

        for (int i = 0; i < size(); i++){
            novo_arr[i] = arr[i];
        }

        capacidade = nova_capacidade;
        arr = novo_arr;
        
    }

}
