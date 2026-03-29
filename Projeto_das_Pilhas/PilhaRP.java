package Projeto_das_Pilhas;

public interface PilhaRP {
    public int size();
    public void push_P(Object o);
    public void push_R(Object o);
    public void empty();
    public boolean isEmpty(); //não faz sentido ter aviso de erro vazio se queremos se está vazio
    public Object pop_P() throws PilhaVaziaExcecaoRP;
    public Object pop_R() throws PilhaVaziaExcecaoRP;
    public Object topN() throws PilhaVaziaExcecaoRP;
    public Object topR() throws PilhaVaziaExcecaoRP;
    public void grow();

}
