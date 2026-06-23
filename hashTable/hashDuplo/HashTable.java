package hashTable.hashDuplo;

public class HashTable implements Position{
    private Object[] arr;
    private int capacidade, size;
    private int q;

    public HashTable(int capacidade){
        this.capacidade = capacidade;
        this.size = 0;
        arr = new Object[capacidade];
        this.q = 7;  
    }

    public void insert(Object elemento, int key) {
        
        double alfa = (double) size / capacidade; 
        
        if (alfa > 0.5){
            grow();
        }

        Item novo_item = new Item(elemento, key); 

        int indice_elemento = novo_item.getKey() % capacidade; 
        int pulo = q - (novo_item.getKey() % q);

 
        while (arr[indice_elemento] != null){
            indice_elemento = (indice_elemento + pulo) % capacidade;
        }

        arr[indice_elemento] = novo_item;

        size++;
    }

    public Object remove(int key) throws InvalidHashTable{
        if (isEmpty()){
            throw new InvalidHashTable("Nenhum item para remover, está vazio!");
        }

        int indice = key % capacidade; 
        int pulo = q - (key % q);

        Object removido = null; 

        while (arr[indice] != null){ 
           
           Item armazenado = (Item) arr[indice]; 
           
            if (key != armazenado.getKey()){
                indice = (indice + pulo) % capacidade; 
            } else{
                removido = armazenado.getElement(); 
                arr[indice] = null; 
                break;
            }
        }

        if (removido == null){
            throw new InvalidHashTable("não achou a chave para remover");
        }

        size--;
        return removido;
    }

    public Object find(int key) throws InvalidHashTable{
        if (isEmpty()){
            throw new InvalidHashTable("Nenhum item para remover, está vazio!");
        }

        Object achado = null;

        int indice = key % capacidade; 
        int pulo = q - (key % q);

        while (arr[indice] != null){
                    
            Item armazenado = (Item) arr[indice];
            
            if (key != armazenado.getKey()){
                indice = (indice + pulo) % capacidade; 
            } else {
                achado = armazenado.getElement();
                break;
            }
        }

        if (achado == null){
            throw new InvalidHashTable("Não encontrou a chave!");
        }

        return achado;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void grow(){
        int nova_capacidade = capacidade * 2;
        Object[] novo_arr = new Object[nova_capacidade];
    
        for (int i = 0; i < capacidade; i++){
            if (arr[i] != null){
                Item velho_armazenado = (Item) arr[i];
                int novo_indice = velho_armazenado.getKey() % nova_capacidade;
                int pulo = q - (velho_armazenado.getKey() % q);
                
                while (novo_arr[novo_indice] != null){
                    novo_indice = (novo_indice + pulo) % nova_capacidade;
                }

                novo_arr[novo_indice] = velho_armazenado;
            }
        }

        capacidade = nova_capacidade;
        arr = novo_arr;
    }

    
}