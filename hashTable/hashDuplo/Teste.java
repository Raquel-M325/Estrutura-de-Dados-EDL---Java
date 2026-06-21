package hashTable.hashDuplo;

public class Teste {
    public static void main(String[] args) {

        HashTable tabela = new HashTable(4);

        // INSERT
        tabela.insert("A", 1);
        tabela.insert("B", 2);
        tabela.insert("C", 3);
        tabela.insert("D", 4);

        // isso deve forçar grow()
        tabela.insert("E", 5);

        System.out.println("Tamanho: " + tabela.size());

        // FIND
        try {
            System.out.println("Find 3: " + tabela.find(3)); // C
            System.out.println("Find 5: " + tabela.find(5)); // E
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // REMOVE
        try {
            System.out.println("Remove 2: " + tabela.remove(2)); // B
            System.out.println("Remove 1: " + tabela.remove(1)); // A
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // TESTE APÓS REMOÇÃO
        try {
            System.out.println("Find 2: " + tabela.find(2)); // deve lançar exceção
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final size: " + tabela.size());
    }
}