public class PilhaArray implements Pilha{
    
    private int capacidade;
    private int Object[] valor;
    private int i;
    private int crescimento;

    public PilhaArray(int capacidade, int crescimento){
        this.capacidade = capacidade;
        i = -1;

        if (crescimento <= 0){
            crescimento = 0;
        }

        valor = new Object[capacidade];
    }

    public void push(Object o){
        if (i >= capacidade-1){

            if (crescimento == 0){
                capacidade *= 2;
            } else{
                capacidade += crescimento;
            }

            Object novalista[] = new Object[capacidade];
            for (int i = 0; i < valor.length; i++){
                novalista[i] = valor[i];
            }

            valor = novalista;
        }

        novalista[++] = o;
    }  //é melhor observar sobre i 

    public Object pop() throws PilhaVaziaExcecao{
        if (isEmpty()){
            Throw new PilhaVaziaExcecao("A Pilha está vazia");
        }

        Object retira = valor[i--];
        return retira;
    }
}