package Arvore;
public class ArvoreGenerica implements Position{
    private int size;

    public ArvoreGenerica(){
        this.size = 0;
    }

    public void replace(Object o) throws InvalidPositionExceptionArvore{
        if (isEmpty()){
            throw new InvalidPositionExceptionArvore("Erro: Não há nós para acessar");
        }
    }

    public Object swapElement() throws InvalidPositionExceptionArvore{
        if (isEmpty()){
            throw new InvalidPositionExceptionArvore("Erro: Não há nós para acessar");
        }
    }

    public Object depth() throws InvalidPositionExceptionArvore{
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
}