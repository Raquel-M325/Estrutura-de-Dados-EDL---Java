package hashTable.linearProbing;

public class HashTable implements Position{
    private Object[] arr;
    private int capacidade, size;

    public HashTable(int capacidade){
        this.capacidade = capacidade;
        this.size = 0;
        arr = new Object[capacidade];
    }

    public void insert(Object elemento, int key) {
        
        double alfa = (double) size / capacidade; //diz o quanto encheu
        
        if (alfa > 0.5){
            grow();
        }
        
        Item novo_item = new Item(elemento, key); //esse é o novo elemento com chave / dicionario

        int indice_elemento = novo_item.getKey() % capacidade; //indice do elemento com chave, mas não é elemento, somente o INDICE

        while (arr[indice_elemento] != null ){
            //coloca o circular para ele andar
            indice_elemento = (indice_elemento + 1) % capacidade;
            
        }

        arr[indice_elemento] = novo_item;

        size++;
    }

    public Object remove(int key) throws InvalidHashTable{
        if (isEmpty()){
            throw new InvalidHashTable("Nenhum item para remover, está vazio!");
        }

        int indice = key % capacidade; //primeiro pego a chave e depois irei pegar o que está armazenado

        Object removido = null; 

        while (arr[indice] != null){ //enquanto tiver indice
           
           Item armazenado = (Item) arr[indice]; //o que já existe da chave e elemento, acessando ela
           
            if (key != armazenado.getKey()){
                indice = (indice + 1) % capacidade; //anda o indice!
            } else{
                removido = armazenado.getElement(); //armazena
                arr[indice] = null; //ele tira o item do indice armazenado
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

        int indice = key % capacidade; //lembre-se que a posicao sempre é int

        while (arr[indice] != null){
                    
            Item armazenado = (Item) arr[indice];
            
            if (key != armazenado.getKey()){
                indice = (indice + 1) % capacidade; //não esqueça do + 1 para poder andar, senao ficaria parado
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
                
                while (novo_arr[novo_indice] != null){
                    novo_indice = (novo_indice + 1) % nova_capacidade;
                }

                novo_arr[novo_indice] = velho_armazenado;
            }
        }

        capacidade = nova_capacidade;
        arr = novo_arr;

    }

    
}