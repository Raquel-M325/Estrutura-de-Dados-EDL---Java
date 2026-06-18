public class HashTable implements Position{
    private Object[] arr;
    private int capacidade, size;

    public HashTable(int capacidade){
        this.capacidade = capacidade;
        this.size = 0;
        arr = new Object[capacidade];
    }

    public void insert(Object elemento, int key) {
        if (capacidade / 2 < size){
            grow();
        }

        Item novo_item = new Item(elemento, key);
        int indice_elemento = novo_item.getKey() % size;

        while (arr[indice_elemento] != null ){
            //coloca o circular para ele andar
        }

        size++;
    }

    public void remove(){

    }

    public Object find(){

    }

    public int size(){
        return size;
    }

    public grow(){
        int nova_capacidade = capacidade * 2;
        Object novo_arr = new Object[nova_capacidade];
        
        for (int i = 0; i < size; i++){
            novo_arr[i] = arr[i];
        }
        
        capacidade = nova_capacidade;
        arr = novo_arr;

    }
}