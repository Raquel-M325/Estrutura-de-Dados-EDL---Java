package hashTable;

public interface Position {
    void insert(Object elemento, int key);
    Object find(int key) throws InvalidHashTable;
    void remove(int key) throws InvalidHashTable;
    boolean isEmpty();
}