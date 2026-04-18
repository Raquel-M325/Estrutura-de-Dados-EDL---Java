package Fila.Vector;

public class TesteFilaVector {
    public static void main(String[] args){
        FilaVectorArray check = new FilaVectorArray();

        check.enqueue(1);
        check.enqueue(2);
        check.enqueue(5);

        System.out.println(check.size());

        check.dequeue();
        System.out.println(check.size());
    }
}
