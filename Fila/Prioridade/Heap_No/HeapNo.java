package Fila.Prioridade.Heap_No;

public class HeapNo implements Position{
    private No root;
    private int size;

    public HeapNo(){
        this.root = null;
        this.size = 0;
    }

    public void insert(int key, Object elemento){
        No novo = new No(elemento, key);

        if (isEmpty()){
            root = novo;
        }
        else{
            
        }
        size++;
        upheap(novo);
    }

    public void swap(No node1, No node2) throws InvalidPositionExceptionHeapNo{
        if (isEmpty()){
            throw new InvalidPositionExceptionHeapNo("Heap vazia");
        }

        if (node1 == null || node2 == null){
            throw new InvalidPositionExceptionHeapNo("Nó nulo");
        }

        Object salvo = node1.getElement();
        node1.setElement(node2.getElement());
        node2.setElement(salvo);

    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void upheap(No node) throws InvalidPositionExceptionHeapNo{
        if (isEmpty()){
            throw new InvalidPositionExceptionHeapNo("Heap vazia");
        }

        if (node == null){
            throw new InvalidPositionExceptionHeapNo("Nó nulo");
        }

        while (!isRoot(node)){
            if (node.getKey() < node.getParent().getKey()){
                swap(node, node.getParent());
                node.setKey(node.getParent().getKey());
                node = node.getParent();
            } //realizou a troca, enquanto for menor que pai até chegar na raiz
            else{
                break;
            }
        }

    }

    public void downheap(No node) throws InvalidPositionExceptionHeapNo{
        if (isEmpty()){
            throw new InvalidPositionExceptionHeapNo("Heap vazia");
        }

        if (node == null){
            throw new InvalidPositionExceptionHeapNo("Nó nulo");
        }

        while (hasLeft(node)){
            


    }

    public No min() throws InvalidPositionExceptionHeapNo{
        if (isEmpty()){
            throw new InvalidPositionExceptionHeapNo("Heap vazia");
        }

        return root;

    }

    public void removeMin() throws InvalidPositionExceptionHeapNo{
        if (isEmpty()){
            throw new InvalidPositionExceptionHeapNo("Heap vazia");
        }

        if (root == null){
            throw new InvalidPositionExceptionHeapNo("Raiz nula");
        }

        

        downheap(root);        
    }   

    public No getRoot() throws InvalidPositionExceptionHeapNo{
        if (isEmpty()){
            throw new InvalidPositionExceptionHeapNo("Heap vazia");
        }

        return root;
    }

    public No getLastNode(){
        
    }

    public No getInsertionPosition(){

    }

    public boolean hasLeft(No node){
        if (node.getChildrenEsq() != null){
            return true;
        }

        return false;
    }

    public boolean hasRight(No node){
        if (node.getChildrenDir() != null){
            return true;
        }

        return false;
    }

    public boolean isRoot(No node){
        if (node == root){
            return true;
        }

        return false;
    }
}
