package Implementação.Sequencia;

public class TestesSequencia {
    public static void main(String[] args) {

        SequenciaDupla seq = new SequenciaDupla();

        // insertLast
        seq.insertLast("A");
        seq.insertLast("B");
        seq.insertLast("C");

        System.out.println("first: " + seq.first()); // A
        System.out.println("last: " + seq.last());   // C
        System.out.println("size: " + seq.size());   // 3

        // insertFirst
        seq.insertFirst("0");
        System.out.println("first após insertFirst: " + seq.first()); // 0

        // elemAtRank
        System.out.println("elemAtRank(2): " + seq.elemAtRank(2)); // A

        // replaceAtRank
        System.out.println("replaceAtRank(2): " + seq.replaceAtRank(2, "X"));
        System.out.println("novo elemAtRank(2): " + seq.elemAtRank(2)); // X

        // insertBefore
        seq.insertBefore(2, "Y");
        System.out.println("elemAtRank(2): " + seq.elemAtRank(2));

        // insertAfter
        seq.insertAfter(2, "Z");
        System.out.println("elemAtRank(3): " + seq.elemAtRank(3));

        // swapElements
        seq.swapElements(0, 2);
        System.out.println("swap first e posição 2:");
        System.out.println("first: " + seq.first());

        // removeAtRank
        System.out.println("removido: " + seq.removeAtRank(1));
        System.out.println("size final: " + seq.size());

        // after / before
        System.out.println("after(0): " + seq.after(0));
        System.out.println("before(2): " + seq.before(2));
    }
}