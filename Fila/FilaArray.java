package Fila;

public class FilaArray implements Fila{
    private int capacidade;
    private int crescimento;
    private Object[] arr;
    private int inicio;
    private int fim;

    public FilaArray(int capacidade, int crescimento){
        int inicio = 0;
        int fim = 0;
        this.capacidade = capacidade;
        this.crescimento = crescimento;
        arr = new Object[capacidade];
    }

    public void enqueue(Object o){
        if (size() == capacidade - 1){
            grow();
        }


    }

    public Object dequeue() throws FilaVaziaExcecao{
        if (isEmpty()){
            throw new FilaVaziaExcecao("A Fila está vazia");
        }
    }

    public int size(){
        return (capacidade - inicio + fim) % capacidade;
    }
   
    public boolean isEmpty(){
        return fim == inicio; //está vazio
    }

    public void grow(){
        int novo_capacidade;
        if (crescimento == 0){
            novo_capacidade = capacidade * 2;
        }
        else{
            novo_capacidade = capacidade + crescimento;
        }

        Object[] novo_arr = new Object[novo_capacidade];
        novo_inicio = inicio; //temporário

        for (int i = 0; i < size(); i++){
            novo_arr[i] = arr[novo_inicio]; //ANALISAR ESSE "INICIO"
            novo_inicio = (novo_inicio + 1) % capacidade;
        }   

        fim = size();
        inicio = 0; //PRECISA ANALISAR MELHOR
        capacidade = novo_capacidade;
        arr = novo_arr;
    }
}