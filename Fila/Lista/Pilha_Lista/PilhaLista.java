package Fila.Lista.Pilha_Lista;

public interface PilhaLista {
    public void push(Object elemento);
    public Object pop() throws PilhaListaVazia;
    public boolean isEmpty();
    public int size();
}
