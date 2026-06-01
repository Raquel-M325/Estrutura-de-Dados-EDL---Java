package Fila.Prioridade;

public class Item {

    private Object elemento;
    private int key;

    public Item(int key, Object elemento){
        this.key = key;
        this.elemento = elemento;
    }

    public int getKey(){
        return key;
    }

    public void setKey(int key){
        this.key = key;
    }

    public Object getElement(){
        return elemento;
    }

    public void setElement(Object elemento){
        this.elemento = elemento;
    }
}