package Fila.Prioridade;

public class Item {
    private Object value, elemento;
    private int key;

    public Item(Object value, Object elemento){
        this.value = value;
        this.key = 0;
    }

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }

    public Object getKey(){
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
