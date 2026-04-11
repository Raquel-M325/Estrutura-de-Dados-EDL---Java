package Fila.Lista;

public class Pilha_lista {
    private class No{
        private Object elemento;
        private No proximo;

        public Object getElemento(){
            return elemento;
        }

        public void setElemento(Object o){
            elemento = o;
        }
    }
}
