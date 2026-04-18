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

    public void enqueue(Object o){

    }

    public Object dequeue() throws FilaListaVazia{

    }

    public boolean isEmpty(){

    }

    public int size(){
        
    }
}
