package Arvore;

import java.util.ArrayList;

public class No {
    private Object elementos;
    private No parents, root;
    private ArrayList<No> children;

    public No(Object elementos){
        this.elementos = elementos;
        this.parents = null;
        this.root = null;
        this.children = new ArrayList<No>();
    }

    public Object getElement(Object elementos){
        return elementos;
    }

    public No getParent(No parents){
        return parents;
    }

    public void setElement(Object elementos){
        this.elementos = elementos;
    }

    public void setParents(No parents){
        this.parents = parents;
    }

}
