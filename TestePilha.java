public class TestePilha{

    public static void main(String[] args){
        Integer[] novo_arr = new Integer[1];
        PilhaArray arr = new PilhaArray(1,0);
        System.out.println("inserindo");
        for (int i = 0; i < 10; i++){
            System.out.println(i);
            arr.push(new Integer(i));

        }

        System.out.println("retirando");
        for (int i = 0; i < 10; i++){
            System.out.print(i); //não quebra a linha
            System.out.println(" - " +arr.pop()); //quebra linha
        }

    }
}