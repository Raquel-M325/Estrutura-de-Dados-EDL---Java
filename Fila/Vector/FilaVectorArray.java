package Fila.Vector;

import java.util.Vector;

public class FilaVectorArray implements FilaVector{
    private Vector<Object> lista = new Vector<>();

    public void enqueue(Object o){
        lista.add(o);
    }

    public Object dequeue() throws FilaVectorVazia{
        if (isEmpty()){
            throw new FilaVectorVazia("Fila está vazia");
        }

        return lista.remove(0); //remover do inicio
    }

    public int size(){
        return lista.size();
    }

    public boolean isEmpty(){
        return lista.isEmpty();
    }
}
