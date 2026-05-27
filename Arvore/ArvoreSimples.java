package Arvore;
public class ArvoreSimples implements Position{
    private int size;
    private No root;

    public ArvoreSimples(){
        this.size = 0;
        this.root = null;
    }

    public void replace(No no, Object o) throws InvalidPositionExceptionArvore{
        if (isEmpty()){
            throw new InvalidPositionExceptionArvore("Erro: Não há nós para acessar");
        }

        
    }

    public Object swapElement() throws InvalidPositionExceptionArvore{
        if (isEmpty()){
            throw new InvalidPositionExceptionArvore("Erro: Não há nós para acessar");
        }
    }

    public Object depth(No no) throws InvalidPositionExceptionArvore{
        if (isEmpty()){
            throw new InvalidPositionExceptionArvore("Erro: Não há nós para acessar");
        }
    }

    public Object height() throws InvalidPositionExceptionArvore{
        if (isEmpty()){
            throw new InvalidPositionExceptionArvore("Erro: Não há nós para acessar");
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

    public No root(){
        return root;
    }
}