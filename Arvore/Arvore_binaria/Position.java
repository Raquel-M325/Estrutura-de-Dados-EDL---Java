package Arvore.Arvore_binaria;

public interface Position {
    int size();
    void insert(No node, Object o);
    void removeMin() throws InvalidPositionExceptionBinaria;
    boolean isEmpty();
    boolean isRoot(No root) throws InvalidPositionExceptionBinaria;
    No getRoot(No root) throws InvalidPositionExceptionBinaria;
    void upheap(No node) throws InvalidPositionExceptionBinaria;
    void downheap(No node) throws InvalidPositionExceptionBinaria;
    void swap(No node1, No node2) throws InvalidPositionExceptionBinaria;
    void replace(No node, Object o) throws InvalidPositionExceptionBinaria;
    No minNo() throws InvalidPositionExceptionBinaria;
    int height(No node) throws InvalidPositionExceptionBinaria;
    int depth(No node) throws InvalidPositionExceptionBinaria;
    boolean isExternal(No node) throws InvalidPositionExceptionBinaria;
    boolean isInternal(No node) throws InvalidPositionExceptionBinaria;
    boolean isDirChild(No parent, No child) throws InvalidPositionExceptionBinaria;
    boolean isEsqChild(No parent, No child) throws InvalidPositionExceptionBinaria;
    boolean isChild(No parent, No child) throws InvalidPositionExceptionBinaria;
    boolean isParent(No child, No parent) throws InvalidPositionExceptionBinaria;
}