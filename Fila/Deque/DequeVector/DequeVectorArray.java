package Fila.Deque.DequeVector;

import java.util.Vector;

public class DequeVectorArray implements DequeVector{
    private Vector <Object> lista = new Vector<>();

    public void insertFirst(Object o){
       lista.insertElementAt(o, 0);
    }

    public void insertLast(Object o){
        lista.add(o); //ele já adiciona no fim
    }

    public Object removeFirst() throws DequeVectorVazia{
        if (isEmpty()){
            throw new DequeVectorVazia("Deque está vazia!");
        }

        return lista.remove(0);
    }

    public Object removeLast() throws DequeVectorVazia{
        if (isEmpty()){
            throw new DequeVectorVazia("Deque está vazia!");
        }

        return lista.remove(lista.size() - 1);
    }

    public Object first() throws DequeVectorVazia{
        if (isEmpty()){
            throw new DequeVectorVazia("Deque está vazia!");   
        }

        return lista.firstElement();
    }

    public Object last() throws DequeVectorVazia{
        if (isEmpty()){
            throw new DequeVectorVazia("Deque está vazia!");
        }

        return lista.lastElement();
    }

    public int size(){
        return lista.size();
    }

    public boolean isEmpty(){
        return lista.isEmpty();
    }

}
