package Arvore;
public class ArvoreSimples implements Position{
    private int size, depth, height;
    private No root;

    public ArvoreSimples(){
        this.size = 0;
        this.root = null;
        this.depth = 0;
        this.height = 0;
    }

    public void replace(No node, Object o) throws InvalidPositionExceptionArvore{
        if (isEmpty()){
            throw new InvalidPositionExceptionArvore("Erro: Não há nós para acessar");
        }

        if (node == null){
            throw new InvalidPositionExceptionArvore("Erro: Nó nulo");
        }

        node.setElement(o);
    }

    public Object swapElement(No nodeA, No nodeB) throws InvalidPositionExceptionArvore{
        if (isEmpty()){
            throw new InvalidPositionExceptionArvore("Erro: Não há nós para acessar");
        }

        if (nodeA == null || nodeB == null){
            throw new InvalidPositionExceptionArvore("Erro: Nó nulo");
        }

        Object salvo = nodeA.getElement();
        nodeA.setElement(nodeB.getElement());
        return salvo;
    }

    public int depth(No node) throws InvalidPositionExceptionArvore{
        if (isEmpty()){
            throw new InvalidPositionExceptionArvore("Erro: Não há nós para acessar");
        }

        if (node == null){
            throw new InvalidPositionExceptionArvore("Erro: Nó nulo");
        }
        
        if (isRoot(node)){
            return 0; //estagio inicial
        } 

        return 1 + depth(node.getParents()); //apos de checar a raiz, irá se somar enquanto tiver filhos
    }

    public int height(No node) throws InvalidPositionExceptionArvore{
        if (isEmpty()){
            throw new InvalidPositionExceptionArvore("Erro: Não há nós para acessar");
        }

        if (node == null){
            throw new InvalidPositionExceptionArvore("Erro: Nó nulo");
        }

        if (isExternal(node)){
            return 0; //estagio inicial
        }
        

    }

    public String preorderPrint() throws InvalidPositionExceptionArvore{
        if (isEmpty()){
            throw new InvalidPositionExceptionArvore("Erro: Não há nós para acessar");
        }
    }

    public String posorderPrint() throws InvalidPositionExceptionArvore{
        if (isEmpty()){
            throw new InvalidPositionExceptionArvore("Erro: Não há nós para acessar");
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isRoot(No node) throws InvalidPositionExceptionArvore{
        if (isEmpty()){
            throw new InvalidPositionExceptionArvore("Erro: Árvore vazia");
        }

        if (root == node && node.getParents() == null){
            return true;
        }

        return false;
    }

    public boolean isInternal(No node) throws InvalidPositionExceptionArvore{
        if (isEmpty()){
            throw new InvalidPositionExceptionArvore("Erro: Árvore vazia");
        }

        return node.getChildren().size() > 0; //se for 0, não tem filhos, ou seja, é externo. ''
    }

    public boolean isExternal(No node) throws InvalidPositionExceptionArvore{
        if (isEmpty()){
            throw new InvalidPositionExceptionArvore("Erro: Árvore vazia");
        }

        return node.getChildren().size() == 0; //se for 0, não tem filhos, ou seja, é externo.
    }
}