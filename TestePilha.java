public class TestePilha{

    public static void main(String[] args){
        int quantidade = 1000000;
        System.out.println("Quantidade de elementos: " + (quantidade));
        PilhaArray arr = new PilhaArray(1,0);
        System.out.println("inserindo");
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < quantidade; i++){
            System.out.println(i);
            arr.push((i));

        }

        long fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim - inicio) + "ms");

    }
}