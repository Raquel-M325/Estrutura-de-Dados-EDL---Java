package Arvore;

public class Test {
    public static void main(String[] args) {

        ArvoreSimples arvore = new ArvoreSimples();

        try {

            arvore.insert("A", null);

            No node1 = arvore.getRoot();

            arvore.insert("B", node1);
            arvore.insert("C", node1);

            No node2 = node1.getChildren().get(0);

            arvore.insert("D", node2);
            arvore.insert("E", node2);

            System.out.println("Pré-Ordem:");
            System.out.println(arvore.preorderPrint(node1));

            System.out.println();

            System.out.println("Pós-Ordem:");
            System.out.println(arvore.posorderPrint(node1));

        } catch (InvalidPositionExceptionArvore e) {
            System.out.println(e.getMessage());
        }
    }
}