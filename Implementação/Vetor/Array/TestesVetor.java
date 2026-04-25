package Implementação.Vetor.Array;

public class TestesVetor {
    public static void main(String[] args){
        VetorArray check = new VetorArray(10);

        check.insertAtRank(0, 5);
        check.insertAtRank(1, 6);
        check.insertAtRank(2, 7);

        System.out.println(check.size());

        check.removeAtRank(1);

        System.out.println(check.size());

        check.replaceAtRank(1, 10);

        System.out.println(check.elemAtRank(1));
    }
}
