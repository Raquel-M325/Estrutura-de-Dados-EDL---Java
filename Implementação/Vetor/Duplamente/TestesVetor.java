package Implementação.Vetor.Duplamente;
public class TestesVetor {

    public static void main(String[] args){

        VetorDupla vetor = new VetorDupla();

        vetor.insertAtRank(0, "A");
        vetor.insertAtRank(1, "B");
        vetor.insertAtRank(2, "C");

        System.out.println(vetor.elemAtRank(0));
        System.out.println(vetor.elemAtRank(1));
        System.out.println(vetor.elemAtRank(2));

        System.out.println("Removido: " + vetor.removeAtRank(1));

        System.out.println(vetor.elemAtRank(0));
        System.out.println(vetor.elemAtRank(1));

        vetor.replaceAtRank(1, "X");

        System.out.println(vetor.elemAtRank(1));

        System.out.println("Tamanho: " + vetor.size());
    }
}