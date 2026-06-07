package Arvore.Arvore_binaria;

public class Arvore_binaria implements Arvore_binaria_Interface {
    private No root;
    private int size;

    public Arvore_binaria(){
        this.root = null;
        this.size = 0;
    }

    public void insert(No node, Object o){
        No novo = new No();
        novo.setElement(o);
        
    }

    public void removeMin() throws InvalidPositionExceptionBinaria{
        if (isEmpty()){
            throw new InvalidPositionExceptionBinaria("Árvore vazia");
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isRoot() throws InvalidPositionExceptionBinaria{
        if (isEmpty()){
            throw new InvalidPositionExceptionBinaria("Árvore vazia");
        }

        if (root == null){
            throw new InvalidPositionExceptionBinaria("Raiz nula");
            return false;
        }

        return true;
    }

    public No getRoot() throws InvalidPositionExceptionBinaria{
        if (isEmpty()){
            throw new InvalidPositionExceptionBinaria("Árvore vazia");
        }

        if (root == null){
            throw new InvalidPositionExceptionBinaria("Raiz nula");
        }

        return root;
    }

    public void upheap(No node) throws InvalidPositionExceptionBinaria{
        if (isEmpty()){
            throw new InvalidPositionExceptionBinaria("Árvore vazia");
        }

        if (node == null){
            throw new InvalidPositionExceptionBinaria("Nó nulo");
        }
    }

    public void downheap(No node) throws InvalidPositionExceptionBinaria{
        if (isEmpty()){
            throw new InvalidPositionExceptionBinaria("Árvore vazia");
        }
        if (node == null){
            throw new InvalidPositionExceptionBinaria("Nó nulo");
        }
    }

    public void swap(No node1, No node2) throws InvalidPositionExceptionBinaria{
        if (isEmpty()){
            throw new InvalidPositionExceptionBinaria("Árvore vazia");
        }

        if (node1 == null || node2 == null){
            throw new InvalidPositionExceptionBinaria("Nó nulo");
        }

        Object salvo = node1.getElement();
        node1.setElement(node2.getElement());
        node2.setElement(salvo);
    }

    public void replace(No node, Object o) throws InvalidPositionExceptionBinaria{
        if (isEmpty()){
            throw new InvalidPositionExceptionBinaria("Árvore vazia");
        }

        if (node == null){
            throw new InvalidPositionExceptionBinaria("Nó nulo");
        }

    }

    public No minNo() throws InvalidPositionExceptionBinaria{
        if (isEmpty()){
            throw new InvalidPositionExceptionBinaria("Árvore vazia");
        }

        return root;
    }

    public int height(No node) throws InvalidPositionExceptionBinaria{
        if (isEmpty()){
            throw new InvalidPositionExceptionBinaria("Árvore vazia");
        }

        if (node == null){
            throw new InvalidPositionExceptionBinaria("Nó nulo");
        }
    }

    public int depth(No node) throws InvalidPositionExceptionBinaria{
        if (isEmpty()){
            throw new InvalidPositionExceptionBinaria("Árvore vazia");
        }

        if (node == null){
            throw new InvalidPositionExceptionBinaria("Nó nulo");
        }
    }

    public boolean isExternal(No node) throws InvalidPositionExceptionBinaria{
        if (isEmpty()){
            throw new InvalidPositionExceptionBinaria("Árvore vazia");
        }

        if (node == null){
            throw new InvalidPositionExceptionBinaria("Nó nulo");
        }
    }

    public boolean isInternal(No node) throws InvalidPositionExceptionBinaria{
        if (isEmpty()){
            throw new InvalidPositionExceptionBinaria("Árvore vazia");
        }

        if (node == null){
            throw new InvalidPositionExceptionBinaria("Nó nulo");
        }
    }

    public boolean isDirChild(No parent, No child) throws InvalidPositionExceptionBinaria{
        if (isEmpty()){
            throw new InvalidPositionExceptionBinaria("Árvore vazia");
        }

    }

    public boolean isEsqChild(No parent, No child) throws InvalidPositionExceptionBinaria{
        if (isEmpty()){
            throw new InvalidPositionExceptionBinaria("Árvore vazia");
        }
    }

    public boolean isChild(No parent, No child) throws InvalidPositionExceptionBinaria{
        if (isEmpty()){
            throw new InvalidPositionExceptionBinaria("Árvore vazia");
        }
    }

     public boolean isParent(No child, No parent) throws InvalidPositionExceptionBinaria{
        if (isEmpty()){
            throw new InvalidPositionExceptionBinaria("Árvore vazia");
        }

        
    }

}
