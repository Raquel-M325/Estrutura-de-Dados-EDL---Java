package hashTable;

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

        Item armazenado = (Item) arr[indice]; //o que já existe da chave e elemento, acessando ela

        Object removido = null; 

        while (arr[indice] != null){ //enquanto tiver indice
            if (key != armazenado.getKey()){
                indice = (indice + 1) % capacidade; //anda o indice!
                armazenado = (Item) arr[indice]; //ele se atualiza com a mudança do indice!
            } else{
                removido = armazenado.getKey(); //armazena
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

        Item armazenado = (Item) arr[indice];

        while (arr[indice] != null){
            if (key != armazenado.getKey()){
                indice = (indice + 1) % capacidade; //não esqueça do + 1 para poder andar, senao ficaria parado
                armazenado =  (Item) arr[indice];
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

    //PRECISO ANALISAR
    public void grow(int key){
        int nova_capacidade = capacidade * 2;
        Object[] novo_arr = new Object[nova_capacidade];
        
        //não só copia, precisa calcular os indices novamente para depois colocar a copia
        int indice = key % capacidade;
        int indice_novo = key % nova_capacidade;

        Item armazenado = (Item) arr[indice];
        Item armazenado_novo = (Item) novo_arr[indice_novo];

        while (arr[indice] != null){

            //primeiro pego o item com novo indice calculado
            //depois comparo se é igual para colar
            //se colei, pego o proximo

            while (arr[indice] != novo_arr[indice_novo]){
                //isso é só pegando em comparando um elemento da lista velha

                if (arr[indice] == novo_arr[indice_novo]){
                    //se encontrei, colarei o item do indice na mesma posicao
                    armazenado_novo = armazenado;
                    break;

                } else{ //senão, terei que andar até achar da nova lista
                    indice_novo = (indice_novo + 1) % nova_capacidade;
                    armazenado_novo = (Item) novo_arr[indice_novo];

                }

            } 
           
        }

        capacidade = nova_capacidade;
        arr = novo_arr;

    }

    
}