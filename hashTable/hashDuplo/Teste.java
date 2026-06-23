package hashTable.hashDuplo;

public class Teste {
    public static void main(String[] args) {

        HashTable ht = new HashTable(5);

        // INSERT
        ht.insert("A", 1);
        ht.insert("B", 2);
        ht.insert("C", 3);
        ht.insert("D", 4);
        ht.insert("E", 5);

        System.out.println("Size após insert: " + ht.size());

        // FIND
        try {
            System.out.println("Find 3: " + ht.find(3));
            System.out.println("Find 5: " + ht.find(5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // REMOVE
        try {
            System.out.println("Remove 2: " + ht.remove(2));
            System.out.println("Remove 1: " + ht.remove(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // TESTE DE BUSCA APÓS REMOÇÃO
        try {
            System.out.println("Find 2: " + ht.find(2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final size: " + ht.size());
    }
}