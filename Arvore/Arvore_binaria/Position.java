package Arvore.Arvore_binaria;

public interface Position {

    int size();

    boolean isEmpty();

    No getRoot() throws InvalidPositionExceptionBinaria;

    No parent(No node) throws InvalidPositionExceptionBinaria;

    No leftChild(No node) throws InvalidPositionExceptionBinaria;

    No rightChild(No node) throws InvalidPositionExceptionBinaria;

    boolean hasLeft(No node) throws InvalidPositionExceptionBinaria;

    boolean hasRight(No node) throws InvalidPositionExceptionBinaria;

    boolean isRoot(No node) throws InvalidPositionExceptionBinaria;

    boolean isInternal(No node) throws InvalidPositionExceptionBinaria;

    boolean isExternal(No node) throws InvalidPositionExceptionBinaria;

    boolean isLeftChild(No node) throws InvalidPositionExceptionBinaria;

    boolean isRightChild(No node) throws InvalidPositionExceptionBinaria;

    int height(No node) throws InvalidPositionExceptionBinaria;

    int depth(No node) throws InvalidPositionExceptionBinaria;

    void insert(int elemento);

    No find(int elemento) throws InvalidPositionExceptionBinaria;

    void remove(int elemento) throws InvalidPositionExceptionBinaria;

    void mostrar() throws InvalidPositionExceptionBinaria;
}