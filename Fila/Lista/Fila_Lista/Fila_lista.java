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

        //preciso analisar
        private int size;
        private No primeiro;
        private No ultimo;
        
    }

    public void enqueue(Object elemento){

    }

    public Object dequeue() throws FilaListaVazia{
        if (isEmpty()){
            throw new FilaListaVazia("Fila está vazia!");
        }
    }

    public boolean isEmpty(){

    }

    public int size(){
        
    }
}
