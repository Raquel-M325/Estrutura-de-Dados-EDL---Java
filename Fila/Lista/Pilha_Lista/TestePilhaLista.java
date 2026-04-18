package Fila.Lista.Pilha_Lista;

public class TestePilhaLista {
    public static void main(String[] args){
        Pilha_lista check = new Pilha_lista();
        
        System.out.println(check.size());
        check.push(1);
        System.out.println(check.size());

        check.push(2);
        System.out.println(check.size());

        check.push(3);
        System.out.println(check.size());

        check.pop();
        check.pop();
        System.out.println(check.size());


    }
}
