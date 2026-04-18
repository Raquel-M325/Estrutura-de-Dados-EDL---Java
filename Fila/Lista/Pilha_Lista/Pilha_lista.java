package Fila.Lista.Pilha_Lista;

public class Pilha_lista implements PilhaLista{
    private class No{
        private Object elemento; //lista
        private No proximo; 

        public Object getElemento(){
            return elemento;
        }

        public void setElemento(Object o){
            elemento = o;
        }
    }

    private int size;
    private No top; //por ser pilha para referencia do topo

    public void push(Object elemento){
        No novo = new No();
        novo.setElemento(elemento); //reserva
        novo.proximo = top; //ve o topo
        top = novo; //o topo se tornara o no que está reservado para adicionar
        size++; 
    }

    public Object pop() throws PilhaListaVazia{
        if (isEmpty()){
            throw new PilhaListaVazia("A Pilha está vazia!");
        }


    }

    public boolean isEmpty(){
        return top == null;
    }

    public int size(){
        return size;
    }

    
}
