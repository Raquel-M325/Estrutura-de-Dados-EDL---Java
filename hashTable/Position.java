public interface Position {
    void insert(Object elemento, int key);
    Object find(int key);
    void remove(int key);
}