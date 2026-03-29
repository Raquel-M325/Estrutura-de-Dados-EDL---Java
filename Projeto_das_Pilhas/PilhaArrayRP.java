package Projeto_das_Pilhas;

public class PilhaArrayRP implements PilhaRP{
    private int capacidade;
    private Object arr[];
    private int top_R;
    private int top_P;
    
    public PilhaArrayRP(int top_P, int top_R, int capacidade){
        top_P = capacidade - 1; //último
        top_R = -1;
        this.capacidade = capacidade;
        arr = new Object[capacidade];
    }

    public void push_R(Object o){
        if (top_R + 1 == top_P){ //está inserindo o vermelho, então só ele vai andar e não o preto
            grow();
        }

        arr[++top_R] = o;
    }

    public void push_P(Object o){
        if (top_P - 1 == top_R){ //já aqui é somente o preto, andando o contrário
            grow();
        }

        arr[--top_P] = o;
    }

    public Object pop_P() throws PilhaVaziaExcecaoRP{
        if (isEmpty()){
            throw new PilhaVaziaExcecaoRP("A Pilha está vazia");
        }

        return arr[top_P++]; //preciso ver se a ordem tá certa
    }
    
    public Object pop_R() throws PilhaVaziaExcecaoRP{
        if (isEmpty()){
            throw new PilhaVaziaExcecaoRP("A Pilha está vazia");
        }

        return arr[top_R--]; 
    }

    public Object topN() throws PilhaVaziaExcecaoRP{
        if (isEmpty()){
            throw new PilhaVaziaExcecaoRP("A pilha está vazia");
        }

        return arr[top_P];
    }

    public Object topR() throws PilhaVaziaExcecaoRP{
        if (isEmpty()){
            throw new PilhaVaziaExcecaoRP("A Pilha está vazia");
        }

        return arr[top_R];
    }

    public int size(){
        return (top_R + 1) + (capacidade - top_P);
    }

    public boolean isEmpty(){
        if (top_R == -1 && top_P == capacidade){
            return true;
        }

        return false;
    }

    public void empty(){
        if (isEmpty()){
            System.out.println("Já está vazio a pilha");
        }

        top_P = -1;
        top_R = capacidade;  //preciso ver se funciona dessa forma
    }

    public void grow(){
        int novo_capacidade = capacidade * 2;
        Object novo_arr[] = new Object[novo_capacidade];

        for (int i = 0; i <= top_R; i++){
            novo_arr[i] = arr[i]; //copiando o vermelho
        } 

        int tamanho_P = capacidade - top_P;
        int novo_top_P = novo_capacidade - tamanho_P;

        for (int i = 0; i < tamanho_P; i++){
            novo_arr[novo_top_P + i] = arr[top_P + i]; //precisa andar pelo indice somando, sem ser por 1
        }


        capacidade = novo_capacidade;
        arr = novo_arr;
        top_P = novo_top_P;

    }

}
