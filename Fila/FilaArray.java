package Fila;

public class FilaArray implements Fila{
    private int capacidade;
    private int crescimento;
    private Object[] arr;
    private int inicio;
    private int fim;
    private int menor;

    public FilaArray(int capacidade, int crescimento){
        this.inicio = 0;
        this.fim = 0;
        this.capacidade = capacidade;
        this.crescimento = crescimento;
        arr = new Object[capacidade];
    }

    public void enqueue(Object o){
        if (size() == capacidade - 1){
            grow();
        }

        int valorElemento = (int)o; //precisava converter temporariamente para usar a comparação

        if (isEmpty() || menor > valorElemento){
            menor = valorElemento;
        }

        arr[fim] = o;
        fim = (fim + 1) % capacidade;

    }

    public Object dequeue() throws FilaVaziaExcecao{
        if (isEmpty()){
            throw new FilaVaziaExcecao("A Fila está vazia");
        }

        Object pop_retirado = arr[inicio];
        inicio = (inicio + 1) % capacidade; 
        
        if (!isEmpty()){
            menor = (int)arr[inicio]; //precisa reiniciar o menor
            for (int i = inicio; i != fim; i = (i + 1) % capacidade){
                if (menor > (int)arr[i]){
                    menor = (int)arr[i];
                }
            } //foi um array circular
        }

        return pop_retirado;
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
        int novo_inicio = inicio; //temporário que usa

        for (int i = 0; i < size(); i++){
            novo_arr[i] = arr[novo_inicio]; 
            novo_inicio = (novo_inicio + 1) % capacidade;
        }   

        fim = size();
        inicio = 0; 
        capacidade = novo_capacidade;
        arr = novo_arr;
    }

    public Object acessarMenor() throws FilaVaziaExcecao{
       if (isEmpty()){
            throw new FilaVaziaExcecao("Não tem elemento na fila!");
       }
       
        return menor;  
    }
    
}