package Implementação.Lista.Duplamente;

public class TestesLista {

    public static void main(String[] args) {

        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.insertLast("A");
        lista.insertLast("B");
        lista.insertLast("C");

        System.out.println(lista.first()); // A
        System.out.println(lista.last());  // C
        System.out.println(lista.size());  // 3

        lista.insertFirst("0");
        System.out.println(lista.first()); // 0

        lista.insertBefore(2, "X");
        System.out.println(lista.replaceElement(2, "Z"));

        lista.swapElements(0, 2);

        System.out.println(lista.remove(1));

        System.out.println(lista.size());
    }
}