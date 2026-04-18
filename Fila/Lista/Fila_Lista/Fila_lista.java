package Fila.Lista.Fila_Lista;

public class Fila_lista implements FilaLista{
    private class No{
        private Object elemento;
        private No proximo;

        public Object getElement(){
            return elemento;
        }

        public void setElement(Object o){
            elemento = o;
        }
    }

    private int size;
    private No inicio;
    private No fim;

    public void enqueue(Object elemento){
        No novo = new No();
        novo.setElement(elemento);
        if (isEmpty()){
            inicio = novo;
        } else{
            fim.proximo = novo;
        }
        fim = novo;
        size++;
    }

    public Object dequeue() throws FilaListaVazia{
        if (isEmpty()){
            throw new FilaListaVazia("Fila está vazia!");
        }

        Object valor = inicio.getElement();
        inicio = inicio.proximo;
        size--;
        return valor;

    }

    public boolean isEmpty(){
        return inicio == null;
    }

    public int size(){
        return size;
    }
}
