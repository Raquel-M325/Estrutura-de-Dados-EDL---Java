package Arvore.Arvore_generica;
import java.util.ArrayList;
public class No {
    private Object elementos;
    private No parents;
    private ArrayList<No> children; //porque tem varios filhos, sendo uma lista de Nós

    public No(){
        this.elementos = null;
        this.parents = null;
        this.children = new ArrayList<No>();
    }

    public Object getElement(){
        return elementos;
    }

    public No getParents(){
        return parents;
    }

    public ArrayList<No> getChildren(){
        return children;
    }

    public void setElement(Object elementos){
        this.elementos = elementos;
    }

    public void setParents(No parents){
        this.parents = parents;
    }

    public void setChildren(No node){
        children.add(node); //porque é uma lista que esta adicionando
    }
}
