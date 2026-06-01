package Arvore;
public class ArvoreSimples implements Position{
    private int size;
    private No root;

    public ArvoreSimples(){
        this.size = 0;
        this.root = null;
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
            return 0; //estagio inicial, ele checa na raiz até chegar o final dos filhos, se for externo, ele zera 
        }

        int maxHeight = 0;
        for (int i = 0; i < node.getChildren().size(); i++){ 
            int conta = height(node.getChildren().get(i)); //para ele andar em cada nó dos filhos antes de comparar, esse height fica chamando a recursividade, conferindo varias vezes; esse get serve para pegar a posicao, do qual tive que definir o i para ele andar em cada nó dos filhos
            maxHeight = Math.max(conta, maxHeight); //compara o valor atual i com o maximo, e retorna o maior
        }

        return 1 + maxHeight; //soma 1 depois que viu quem é maior, ou seja, o mais profundo
    }

    public String preorderPrint(No node) throws InvalidPositionExceptionArvore{
        if (isEmpty()){
            throw new InvalidPositionExceptionArvore("Erro: Não há nós para acessar");
        }

        if (node == null){
            throw new InvalidPositionExceptionArvore("Erro: Nó nulo");
        }

        if (isRoot(node)){
            return node.getElement().toString();
        }

        String resultado = node.getElement().toString(); //pega o elemento do nó atual e transforma em string
        for (int i = 0; i < node.getChildren().size(); i++){
            resultado += ", " + preorderPrint(node.getChildren().get(i)); //para cada filho que andar e pegar, vai colocar apos do no atual, sendo no proximo
        }
        
        return resultado;
    }

    public String posorderPrint(No node) throws InvalidPositionExceptionArvore{
        if (isEmpty()){
            throw new InvalidPositionExceptionArvore("Erro: Não há nós para acessar");
        }

        if (node == null){
            throw new InvalidPositionExceptionArvore("Erro: Nó nulo");
        }

        if (isExternal(node)){
            return node.getElement().toString();
        }

        String resultado = Node.getElement().String();
        for (int i = 0; i < node.getParents().getChildren().size(); i++){
            resultado = ", " + 
        }

        return 

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

    public void insert(Object o, No node) throws InvalidPositionExceptionArvore{
        if (node == null){
            throw new InvalidPositionExceptionArvore("Está vazia");
        }

        No novo = new No();
        novo.setElement(o);
        node.setChildren(novo);
        size++;
    }

    public No remove(No node) throws InvalidPositionExceptionArvore{
        if (isEmpty()){
            throw new InvalidPositionExceptionArvore("Está vazia");
        }

        if (node == null){
            throw new InvalidPositionExceptionArvore("Está vazia");
        }

        //tirar a duvida com professor
        if (isExternal()){
            Object salvo = node.getElement();
            node.getElement().remove(node);
            return node.getElement(salvo);
        }

        if (isInternal()){

            //Talvez tenha que dizer o No proximo e anterior para que aquele seja removido
        }
    }
}