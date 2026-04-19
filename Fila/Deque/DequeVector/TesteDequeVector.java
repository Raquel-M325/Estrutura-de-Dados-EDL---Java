package Fila.Deque.DequeVector;

public class TesteDequeVector {
    public static void main(String[] args){
        DequeVectorArray check = new DequeVectorArray();

        check.insertFirst(5);
        check.insertLast(6);
        check.insertLast(7);

        System.out.println(check.first());
        System.out.println(check.last());
        System.out.println(check.size());

        check.removeFirst();
        
        System.out.println(check.first());
        System.out.println(check.last());
        System.out.println(check.size());

    }
}
