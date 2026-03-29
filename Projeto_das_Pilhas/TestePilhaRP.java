package Projeto_das_Pilhas;

public class TestePilhaRP {
    public static void main(String[] args){
        int quantidade = 10; //pode mudar a quantidade de elementos
        System.out.println("Quantidade de elementos: " + (quantidade));
        PilhaArrayRP arr = new PilhaArrayRP(0, 0, quantidade * 2);
        System.out.println("inserindo...");

        long inicio = System.currentTimeMillis();
        for (int i = 0; i < quantidade; i++){
            arr.push_P(i); //analisar sobre essa parte melhor
            arr.push_R(i);
        }

        long fim = System.currentTimeMillis();
        System.out.println("Tempo do inserção: " + (fim - inicio) + "ms");

        System.out.println("Removendo elementos...");
        inicio = System.currentTimeMillis();
        
        for (int i = 0; i < quantidade; i++){
            arr.pop_P();
            arr.pop_R();
        }
    }
}
