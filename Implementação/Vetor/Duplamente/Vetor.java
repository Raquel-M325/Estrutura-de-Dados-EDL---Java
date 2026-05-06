package Implementação.Vetor.Duplamente;

public interface Vetor {
    int size();
    boolean isEmpty();
    Object elemAtRank(int r) throws VetorVazia; //retorna o elemento do indice somente
    Object replaceAtRank(int r, Object o) throws VetorVazia; //substitui o elemento de acordo com o indice escolhido
    void insertAtRank(int r, Object o); //insere um novo elemento no elemento escolhido que empurra os demais
    Object removeAtRank(int r) throws VetorVazia; //remove o elemento escolhido do indice
}
