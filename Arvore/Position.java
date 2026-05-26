package Arvore;
public interface Position{
    void replace(No no, Object o) throws InvalidPositionExceptionArvore;
    Object swapElement() throws InvalidPositionExceptionArvore;
    int depth(No no) throws InvalidPositionExceptionArvore;
    int height() throws InvalidPositionExceptionArvore;
    String preorderPrint() throws InvalidPositionExceptionArvore;
    String posorderPrint() throws InvalidPositionExceptionArvore;
    int size();
    boolean isEmpty();
}