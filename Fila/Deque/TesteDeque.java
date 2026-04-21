package Fila.Deque;

public class TesteDeque{
    public static void main(String[] args) throws DequeVazia{
        DequeArray check = new DequeArray(5);

        check.insertFirst(5);
        check.insertLast(6);
        check.insertLast(7);

        System.out.println(check.first());
        System.out.println(check.last());
        System.out.println(check.size());
        System.out.println(check.acessarMenor());

        check.removeFirst();
        
        System.out.println(check.first());
        System.out.println(check.last());
        System.out.println(check.size());
        System.out.println(check.acessarMenor());

    }
}
