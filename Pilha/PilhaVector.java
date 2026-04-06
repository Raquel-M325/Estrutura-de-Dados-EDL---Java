package Pilha;
import java.util.Vector;

public class PilhaVector implements Pilha{
    private Vector<Object> lista = new Vector<>();

    public void push(Object o){
        lista.add(o);
    }

    public Object pop() throws PilhaVaziaExcecao{
        if (isEmpty()){
            throw new PilhaVaziaExcecao("Pilha está vazia");
        }

        return lista.remove(lista.size() - 1); //ir no último
    }

    public Object top() throws PilhaVaziaExcecao{
        if (isEmpty()) {
            throw new PilhaVaziaExcecao("Pilha está vazia");
        }

        return lista.lastElement();
    }

    public boolean isEmpty(){
        return lista.isEmpty();
    }
    
    public void empty() throws PilhaVaziaExcecao{
        if (isEmpty()){
            throw new PilhaVaziaExcecao("A pilha já está vazia");
        }

        lista.clear();
    }

    public int size(){
        return lista.size();
    }

    public void adicionaPilha(Pilha p){
        
    }
}
