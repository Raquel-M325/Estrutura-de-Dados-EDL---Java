package Implementação.Lista.Duplamente;

public class ListaDuplamenteEncadeada implements Lista {

    private int size;
    private No head, tail;

    public ListaDuplamenteEncadeada() {
        this.head = new No();
        this.tail = new No();
        this.head.setElement(null);
        this.tail.setElement(null);
        this.head.setProximo(tail);
        this.tail.setAnterior(head);
        this.size = 0;
    }

    public boolean isFirst(int i) {
        return i == 0;
    }

    public boolean isLast(int i) {
        return i == size() - 1;
    }

    public Object first() throws ListaVazia {
        if (isEmpty()) {
            throw new ListaVazia("Lista está vazia!");
        }

        No elemento = head.getProximo();
        return elemento.getElement();
    }

    public Object last() throws ListaVazia {
        if (isEmpty()) {
            throw new ListaVazia("Lista está vazia!");
        }

        No elemento = tail.getAnterior(); // se fosse proximo seria vazio (tail é sentinela)
        return elemento.getElement(); // Pega o elemento
    }

    public Object before(int i) throws ListaVazia {
        if (isEmpty()) {
            throw new ListaVazia("Lista está vazia!");
        }

        if (i < 0 || i >= size()) {
            throw new ListaVazia("Indice invalido");
        }

        No elemento = head.getProximo();

        for (int j = 0; j < i; j++) {
            elemento = elemento.getProximo();
        }

        No before = elemento.getAnterior();
        return before.getElement();
    }

    public Object after(int i) throws ListaVazia {
        if (isEmpty()) {
            throw new ListaVazia("Lista está vazia!");
        }

        if (i < 0 || i >= size() - 1) {
            throw new ListaVazia("Indice invalido");
        }

        No elemento = head.getProximo();

        for (int j = 0; j < i; j++) {
            elemento = elemento.getProximo();
        }

        No after = elemento.getProximo();
        return after.getElement();
    }

    public Object replaceElement(int i, Object o) throws ListaVazia {
        if (isEmpty()) {
            throw new ListaVazia("Lista está vazia!");
        }

        if (i < 0 || i >= size()) {
            throw new ListaVazia("Indice invalido");
        }

        No elemento = head.getProximo();

        for (int j = 0; j < i; j++) {
            elemento = elemento.getProximo();
        }

        Object salvo = elemento.getElement();
        elemento.setElement(o); // substitui valor
        return salvo; // retorna antigo
    }

    public void swapElements(int i, int j) throws ListaVazia {
        if (isEmpty()) {
            throw new ListaVazia("Lista está vazia!");
        }

        if (i < 0 || i >= size() || j < 0 || j >= size()) {
            throw new ListaVazia("Indice invalido");
        }

        if (i == j) {
            return; // nada a fazer
        }

        No elemento_i = head.getProximo();
        for (int r = 0; r < i; r++) {
            elemento_i = elemento_i.getProximo();
        }

        No elemento_j = head.getProximo();
        for (int r = 0; r < j; r++) {
            elemento_j = elemento_j.getProximo();
        }

        // troca de elementos
        Object temp = elemento_i.getElement();
        elemento_i.setElement(elemento_j.getElement());
        elemento_j.setElement(temp);
    }

    public void insertBefore(int i, Object o) {
        if (i < 0 || i > size()) {
            throw new ListaVazia("Indice invalido");
        }

        No atual = head.getProximo();

        for (int j = 0; j < i; j++) {
            atual = atual.getProximo();
        }

        No anterior = atual.getAnterior();

        No novo = new No();
        novo.setElement(o);

        novo.setAnterior(anterior);
        novo.setProximo(atual);

        anterior.setProximo(novo);
        atual.setAnterior(novo);

        size++;
    }

    public void insertAfter(int i, Object o) {
        if (i < 0 || i >= size()) {
            throw new ListaVazia("Indice invalido");
        }

        No atual = head.getProximo();

        for (int j = 0; j < i; j++) {
            atual = atual.getProximo();
        }

        No proximo = atual.getProximo();

        No novo = new No();
        novo.setElement(o);

        // encaixe depois do atual
        novo.setAnterior(atual);
        novo.setProximo(proximo);

        atual.setProximo(novo);
        proximo.setAnterior(novo);

        size++;
    }

    public void insertFirst(Object o) {
        No atual = head.getProximo();
        No novo = new No();
        novo.setElement(o);

        // novo fica depois do head
        novo.setAnterior(head);
        novo.setProximo(atual);

        atual.setAnterior(novo);
        head.setProximo(novo);

        size++;
    }

    public void insertLast(Object o) {
        No atual = tail.getAnterior();
        No novo = new No();
        novo.setElement(o);

        // novo fica antes do tail
        novo.setAnterior(atual);
        novo.setProximo(tail);

        atual.setProximo(novo);
        tail.setAnterior(novo);

        size++;
    }

    public Object remove(int i) throws ListaVazia {
        if (isEmpty()) {
            throw new ListaVazia("Lista está vazia!");
        }

        if (i < 0 || i >= size()) {
            throw new ListaVazia("Indice invalido");
        }

        No elemento = head.getProximo();

        for (int j = 0; j < i; j++) {
            elemento = elemento.getProximo();
        }

        No anterior = elemento.getAnterior();
        No proximo = elemento.getProximo();

        // reconecta os vizinhos
        anterior.setProximo(proximo);
        proximo.setAnterior(anterior);

        Object salva = elemento.getElement();
        size--;

        return salva;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}