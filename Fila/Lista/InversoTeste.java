package Fila.Lista;

import Fila.Lista.Fila_Lista.*;
import Fila.Lista.Fila_Lista.Fila_lista;
import Fila.Lista.Pilha_Lista.*;
import Fila.Lista.Pilha_Lista.Pilha_lista;

public class InversoTeste {
    public static void main(String[] args){
        Fila_lista check_fila = new Fila_lista();

        check_fila.enqueue(1);
        check_fila.enqueue(2);
        check_fila.enqueue(3);

        //inverter - a pilha é o responsável para inverter!

        Pilha_lista check_pilha = new Pilha_lista();
        while (!check_fila.isEmpty()){
            check_pilha.push(check_fila.dequeue());
        } //esvazia a fila para inverter na pilha

        while (!check_pilha.isEmpty()){
            check_fila.enqueue(check_pilha.pop());
        } //esvazia a pilha que já está invertida e coloca na fila a mesma forma

        while (!check_fila.isEmpty()){
            System.out.println(check_fila.dequeue());
        }  //imprime a fila e vai esvaziando

    }
}
