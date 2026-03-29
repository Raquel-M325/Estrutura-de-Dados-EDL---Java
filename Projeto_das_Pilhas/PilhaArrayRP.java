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

    }

    public void push_P(Object o){

    }

    public Object pop_P() throws PilhaVaziaExcecaoRP{

    }
    
    public Object pop_R() throws PilhaVaziaExcecaoRP{

    }

    public Object topN() throws PilhaVaziaExcecaoRP{

    }

    public Object topR() throws PilhaVaziaExcecaoRP{

    }

    public int size(){

    }

    public boolean isEmpty(){

    }

    public void empty(){

    }

    public void grow(){

    }

}
