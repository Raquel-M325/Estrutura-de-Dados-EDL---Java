package Projeto_das_Pilhas;

public class TestePilhaRP {
    public static void main(String[] args){
        int quantidade = 1000000; //pode mudar a quantidade de elementos
        System.out.println("Quantidade de elementos: " + (quantidade));
        PilhaArrayRP arrVermelho = new PilhaArrayRP(0, 0, quantidade * 2);
        PilhaArrayRP arrPreto = new PilhaArrayRP(0, 0, quantidade * 2);

        //PUSH PRETO
        System.out.println("----TESTE PUSH PRETO------");
        System.out.println("inserindo preto...");
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < quantidade; i++){
            arrPreto.push_P(i);
        }

        long fim = System.currentTimeMillis();
        System.out.println("Tempo do push/inserir preto: " + (fim - inicio) + "ms");

        //PUSH VERMELHO
        System.out.println("----TESTE PUSH VERMELHO------");
        System.out.println("inserindo vermelho...");
        inicio = System.currentTimeMillis();

        for (int i = 0; i < quantidade; i++){
            arrVermelho.push_R(i);
        }

        fim = System.currentTimeMillis();
        System.out.println("Tempo do push/inserir vermelho: " + (fim - inicio) + "ms");

        //POP PRETO
        System.out.println("----TESTE POP PRETO------");
        System.out.println("Removendo elementos preto...");
        inicio = System.currentTimeMillis();
        
        for (int i = 0; i < quantidade; i++){
            arrPreto.pop_P();
        }

        fim = System.currentTimeMillis();
        System.out.println("Tempo de pop/retirar preto: " + (fim - inicio) + "ms");

        //POP VERMELHO
        System.out.println("----TESTE POP VERMELHO------");
        System.out.println("Removendo elementos vermelho...");
        inicio = System.currentTimeMillis();
        
        for (int i = 0; i < quantidade; i++){
            arrVermelho.pop_R();
        }

        fim = System.currentTimeMillis();
        System.out.println("Tempo de pop/retirar vermelho: " + (fim - inicio) + "ms");


        //RECARREGAR A PILHA
        for (int i = 0; i < quantidade; i++){
            arrPreto.push_P(i);
            arrVermelho.push_R(i);
        }


        //TOP PRETO
        System.out.println("----TESTE TOP PRETO------");
        System.out.println("Dizendo o top preto...");
        inicio = System.currentTimeMillis();

        for (int i = 0; i < quantidade; i++){
            arrPreto.topN();
        }

        fim = System.currentTimeMillis();
        System.out.println("Tempo do top preto: " + (fim - inicio) + "ms");


        //TOP VERMELHO
        System.out.println("----TESTE TOP VERMELHO------");
        inicio = System.currentTimeMillis();

        for (int i = 0; i < quantidade; i++){
            arrVermelho.topR();
        }

        fim = System.currentTimeMillis();
        System.out.println("Tempo do top vermelho: " + (fim - inicio) + "ms");

    }
}
