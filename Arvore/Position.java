package Arvore;
public interface Position{
    void replace(Object o) throws InvalidPositionExceptionArvore;
    Object swapElement() throws InvalidPositionExceptionArvore;
    Object depth() throws InvalidPositionExceptionArvore;
    Object height() throws InvalidPositionExceptionArvore;
    String preorderPrint() throws InvalidPositionExceptionArvore;
    String posorderPrint() throws InvalidPositionExceptionArvore;
    int size();
    boolean isEmpty();
}