package Implementação.Vetor.Duplamente;

public class VetorDupla implements Vetor{
    private No head, tail;
    private int size;

    public VetorDupla(){
        this.head = new No();
        this.tail = new No();
        this.head.setElement(null);
        this.tail.setElement(null);
        this.head.setProximo(tail);
        this.tail.setAnterior(head);
        this.size = 0; 
    }


    public int size(){
        return size;
    }

    public void insertAtRank(int r, Object o){

        No anterior = head;

        if (r < 0 || r > size()){
            throw new VetorVazia("Indice invalido");
        }

        for (int i = 0; i < r; i++){
            anterior = anterior.getProximo(); //ande
        }

        No novo = new No(); //crio um novo no
        novo.setElement(o); //defini o valor

        No Proximo = anterior.getProximo(); 

        novo.setAnterior(anterior); //a ordem IMPORTA
        novo.setProximo(Proximo);

        anterior.setProximo(novo);
        Proximo.setAnterior(novo);

        size++;

    }

    public boolean isEmpty(){
        return size == 0;
    }

    public Object elemAtRank(int r) throws VetorVazia{
        if (isEmpty()){
            throw new VetorVazia("Vetor está vazia!");
        }

        if (r < 0 || r >= size()){
            throw new VetorVazia("Indice invalido");

        }

        No elemento = head.getProximo();

        for (int i = 0; i < r; i++){
            elemento = elemento.getProximo(); //anda
        }

        return elemento.getElement(); //demonstra o elemento
       
    }

    public Object replaceAtRank(int r, Object o) throws VetorVazia{
        if (isEmpty()){
            throw new VetorVazia("Vetor está vazia!");
        }

        if (r < 0 || r >= size()){
            throw new VetorVazia("Indice invalido");

        }

        No elemento = head.getProximo();

        for (int i = 0; i < r; i++){
            elemento = elemento.getProximo();
        }

        Object salvo = elemento.getElement();
        elemento.setElement(o); //substitui pelo novo
        
        return salvo; //retorna o antigo
    }

    public Object removeAtRank(int r) throws VetorVazia{
        if (isEmpty()){
            throw new VetorVazia("Vetor está vazia!");
        }

        if (r < 0 || r >= size()){
            throw new VetorVazia("Indice invalido");

        }

        No elemento = head.getProximo();
        
        for (int i = 0; i < r; i++){
            elemento = elemento.getProximo(); //anda
        }

        //definindo quem é o proximo e anterior o no
        No anterior = elemento.getAnterior(); 
        No proximo = elemento.getProximo();

        //os nos se conectam
        anterior.setProximo(proximo);
        proximo.setAnterior(anterior);

        size--;
        return elemento.getElement();

    }
}
