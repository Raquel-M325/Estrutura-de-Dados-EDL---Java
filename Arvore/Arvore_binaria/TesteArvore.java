package Arvore.Arvore_binaria;

public class TesteArvore {
    public static void main(String[] args)
            throws InvalidPositionExceptionBinaria {

        Arvore_binariaNo arvore = new Arvore_binariaNo();

        System.out.println("Inserindo valores...");

        arvore.insert(10);
        arvore.insert(5);
        arvore.insert(15);
        arvore.insert(2);
        arvore.insert(8);
        arvore.insert(22);

        System.out.println("\nÁrvore após inserções:");
        arvore.mostrar();

        System.out.println("\nBuscando elemento 8:");
        No encontrado = arvore.find(8);
        System.out.println("Encontrado: " + encontrado.getElement());

        System.out.println("\nAltura da raiz:");
        System.out.println(arvore.height(arvore.getRoot()));

        System.out.println("\nProfundidade do nó 8:");
        System.out.println(arvore.depth(encontrado));

        System.out.println("\nRemovendo elemento 5...");
        arvore.remove(5);

        System.out.println("\nÁrvore após remoção:");
        arvore.mostrar();
    }
}