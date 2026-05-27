package Arvore;
public interface Position{
    void replace(No no, Object o) throws InvalidPositionExceptionArvore;
    Object swapElement(No nodeA, No nodeB) throws InvalidPositionExceptionArvore;
    int depth(No no) throws InvalidPositionExceptionArvore;
    int height() throws InvalidPositionExceptionArvore;
    String preorderPrint() throws InvalidPositionExceptionArvore;
    String posorderPrint() throws InvalidPositionExceptionArvore;
    int size();
    boolean isEmpty();
    boolean isRoot(No node) throws InvalidPositionExceptionArvore;
    boolean isExternal(No node) throws InvalidPositionExceptionArvore;
    boolean isInternal(No node) throws InvalidPositionExceptionArvore;
}