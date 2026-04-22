package Implementação.Vetor.Array;

public class VetorArray {
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

        
    }

    public Object replaceAtRank(int r, Object o) throws VetorVazia{
        if (isEmpty()){
            throw new VetorVazia("Vetor array está vazia");
        }
    }

    public void insertAtRank(int r, Object o){

    }

    public Object removeAtRank(int r) throws VetorVazia{
        if (isEmpty()){
            throw new VetorVazia("Vetor array está vazia");
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        
    }

}
