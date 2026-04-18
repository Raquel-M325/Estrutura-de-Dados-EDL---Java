package Fila.Lista.Fila_Lista;

public class TesteFilaLista {
    public static void main(String[] args){
        Fila_lista check = new Fila_lista();
        
        System.out.println(check.size());
        check.enqueue(5);
        System.out.println(check.size());

        check.enqueue(6);
        System.out.println(check.size());

        check.dequeue();
        System.out.println(check.size());
    }
}
