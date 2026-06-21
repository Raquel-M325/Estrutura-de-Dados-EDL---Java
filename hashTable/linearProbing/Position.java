package hashTable.linearProbing;

public interface Position {
    void insert(Object elemento, int key);
    Object find(int key) throws InvalidHashTable;
    Object remove(int key) throws InvalidHashTable;
    boolean isEmpty();
    int size();
    void grow();
}