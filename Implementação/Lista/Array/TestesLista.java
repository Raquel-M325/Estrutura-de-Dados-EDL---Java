package Implementação.Lista.Array;

public class TestesLista {
    public static void main(String[] args) throws ListaVazia {
        ListaArray check = new ListaArray(5);

        // insertLast
        check.insertLast("A");
        check.insertLast("B");
        check.insertLast("C");
        System.out.println("Após insertLast A, B, C: ");
        System.out.println("first: " + check.first());       // A
        System.out.println("last: " + check.last());         // C
        System.out.println("size: " + check.size());         // 3

        // insertFirst
        check.insertFirst("Z");
        System.out.println("\nApós insertFirst Z: ");
        System.out.println("first: " + check.first());       // Z

        // before e after
        System.out.println("\nbefore(2): " + check.before(2)); // B
        System.out.println("after(1): " + check.after(1));     // B

        // replaceElement
        check.replaceElement(1, "X");
        System.out.println("\nApós replaceElement(1, X): ");
        System.out.println("first: " + check.first());       // Z

        // swapElements
        check.swapElements(0, 1);
        System.out.println("\nApós swapElements(0, 1): ");
        System.out.println("first: " + check.first());       // X

        // remove
        check.remove(0);
        System.out.println("\nApós remove(0): ");
        System.out.println("first: " + check.first());       // Z
        System.out.println("size: " + check.size());         // 3

        // isFirst e isLast
        System.out.println("\nisFirst(0): " + check.isFirst(0)); // true
        System.out.println("isLast(2): " + check.isLast(2));     // true
    }
}