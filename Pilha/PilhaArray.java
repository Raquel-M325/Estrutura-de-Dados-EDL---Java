package Pilha;

import Projeto_das_Pilhas.PilhaVaziaExcecaoRP;

public class PilhaArray implements Pilha{
    
    private int capacidade;
    private Object[] arr;
    private int top;
    private int crescimento;
    private int menor;

    public PilhaArray(int capacidade, int crescimento){
        this.capacidade = capacidade;
        top = -1;

        if (crescimento <= 0){
            crescimento = 0;
        }

        arr = new Object[capacidade];
    }

    public void push(Object o){
        if (top >= capacidade-1){

            if (crescimento == 0){
                capacidade *= 2;
            } else{
                capacidade += crescimento;
            }

            Object novo_arr[] = new Object[capacidade];
            for (int i = 0; i < arr.length; i++){
                novo_arr[i] = arr[i];
            }

            arr = novo_arr;
        }

        int elemento = (int)o;
    
        if (isEmpty() || menor > elemento){
            menor = elemento;
        }

        arr[++top] = o;
    }   

    public Object pop() throws PilhaVaziaExcecao{
        if (isEmpty()){
            throw new PilhaVaziaExcecao("A Pilha está vazia");
        }

        Object retira = arr[top--];

        if (!isEmpty()){
            menor = (int)arr[0]; //reserva temporaria no inicio
            for (int i = 0; i <= top; i++){
                if (menor > (int)arr[i]){
                    menor = (int)arr[i];
                }
            }
        }

        return retira;
    }

    public Object top() throws PilhaVaziaExcecao{
        if (isEmpty()){
            throw new PilhaVaziaExcecao("A Pilha está vazia");
        }

        return arr[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int size(){
        return top + 1;
    }

    public void empty(){ //void porque vai retornar nada
        if (isEmpty()){
            System.out.println("Pilha já está vazia"); //não é erro, é mais que já está vazio e não tem mais o que fazer
        }

        top = -1;
    }

    public Object acessarMenor() throws PilhaVaziaExcecao{
        if (isEmpty()){
            throw new PilhaVaziaExcecao("Pilha não contém elementos!");
        }
        
        return menor;
    }

}