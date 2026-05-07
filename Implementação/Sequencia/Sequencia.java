package Implementação.Sequencia;

public interface Sequencia {

    boolean isFirst(int i);
    boolean isLast(int i);

    Object first() throws SequenciaVazia;
    Object last() throws SequenciaVazia;

    Object before(int i) throws SequenciaVazia;
    Object after(int i) throws SequenciaVazia;

    Object replaceElement(int i, Object o) throws SequenciaVazia;
    void swapElements(int i, int j) throws SequenciaVazia;

    void insertBefore(int i, Object o);
    void insertAfter(int i, Object o);
    void insertFirst(Object o);
    void insertLast(Object o);

    Object remove(int i) throws SequenciaVazia;

    int size();
    boolean isEmpty();

    Object elemAtRank(int r) throws SequenciaVazia;
    Object replaceAtRank(int r, Object o) throws SequenciaVazia;
    void insertAtRank(int r, Object o);
    Object removeAtRank(int r) throws SequenciaVazia;
}