package hashTable.linearProbing;

public class Item{
    private Object elemento;
    private int key;

    public Item(Object elemento, int key){
        this.elemento = elemento;
        this.key = key;
    }

    public Object getElement(){
        return elemento;
    }

    public int getKey(){
        return key;
    }

    public void setElement(Object elemento){
        this.elemento = elemento;
    }

    public void setKey(int key){
        this.key = key;
    }
}