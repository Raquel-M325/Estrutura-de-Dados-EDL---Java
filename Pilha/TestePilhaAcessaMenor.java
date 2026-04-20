package Pilha;

public class TestePilhaAcessaMenor {
    public static void main(String[] args){
        PilhaArray check = new PilhaArray(5, 0);

        check.push(1);
        check.push(2);
        check.push(5);

        System.out.println(check.acessarMenor());
        
        check.pop();

        System.out.println(check.acessarMenor());
        System.out.println(check.size());

    }
}