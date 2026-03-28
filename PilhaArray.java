public class PilhaArray implements Pilha{
    
    private int capacidade;
    private Object[] arr;
    private int top;
    private int crescimento;

    public PilhaArray(int capacidade, int crescimento){
        this.capacidade = capacidade;
        top = -1;

        if (crescimento <= 0){
            crescimento = 0;
        }

        arr = new Object[capacidade];
    }

    public void push(Object o){
        if (top >= capacidade-1){

            if (crescimento == 0){
                capacidade *= 2;
            } else{
                capacidade += crescimento;
            }

            Object novo_arr[] = new Object[capacidade];
            for (int i = 0; i < arr.length; i++){
                novo_arr[i] = arr[i];
            }

            arr = novo_arr;
        }

        arr[++top] = o;
    }   

    public Object pop() throws PilhaVaziaExcecao{
        if (isEmpty()){
            throw new PilhaVaziaExcecao("A Pilha está vazia");
        }

        Object retira = arr[top--];
        return retira;
    }

    public Object top() throws PilhaVaziaExcecao{
        if (isEmpty()){
            throw new PilhaVaziaExcecao("A Pilha está vazia");
        }

        return arr[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int size(){
        return top + 1;
    }

}