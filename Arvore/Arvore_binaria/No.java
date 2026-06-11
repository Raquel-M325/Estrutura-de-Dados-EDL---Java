package Arvore.Arvore_binaria;

public class No {
    private No parent, childrenEsq, childrenDir;
    private int elemento;

    public No(int elemento){
        this.parent = null;
        this.childrenEsq = null;
        this.childrenDir = null;
        this.elemento = elemento;
    }

    public void setElement(int elemento){
        this.elemento = elemento;
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

    public int getElement(){
        return elemento;
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

