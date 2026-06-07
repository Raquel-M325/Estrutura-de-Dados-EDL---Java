package Fila.Prioridade.Heap_No;

public class No {
    private int key;
    private No parent, childrenEsq, childrenDir;
    private Object elemento;

    public No(Object elemento, int key){
        this.key = key;
        this.parent = null;
        this.childrenEsq = null;
        this.childrenDir = null;
        this.elemento = elemento;
    }

    public void setElement(Object elemento){
        this.elemento = elemento;
    }

    public void setKey(int key){
        this.key = key;
    }

    public void setParent(No parent){
        this.parent = parent;
    }

    public void setChildrenEsq(No childrenEsq){
        this.childrenEsq = childrenEsq;
    }

    public void setChildrenDir(No childrenDir){
        this.childrenDir = childrenDir;
    }

    public Object getElement(){
        return elemento;
    }

    public int getKey(){
        return key;
    }

    public No getParent(){
        return parent;
    }

    public No getChildrenEsq(){
        return childrenEsq;
    }

    public No getChildrenDir(){
        return childrenDir;
    }
}

