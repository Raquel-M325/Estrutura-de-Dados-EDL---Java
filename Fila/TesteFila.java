package Fila;

public class TesteFila {
    public static void main(String[] args){
        FilaArray check = new FilaArray(5, 0);

        check.enqueue(5);
        check.enqueue(6);
        check.enqueue(10);

        System.out.println(check.acessarMenor());
        
        check.dequeue();

        System.out.println(check.acessarMenor());
        System.out.println(check.size());

    }
}