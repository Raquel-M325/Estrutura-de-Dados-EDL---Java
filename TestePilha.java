public class testepilha{

    public static void main(String[] args){
        Integer[] novolista = new Integer[1];
        PilhaArray lista = new PilhaArray(1,0);
        System.out.println("inserindo");
        for (int i = 0; i < 10; i++){
            System.out.println(i);
            lista.push(new Integer(i));

        }

        System.out.println("retirando");
        for (int i = 0; i < 10; i++){
            System.out.print(i); //não quebra a linha
            System.out.println(" - " +lista.pop()); //quebra linha
        }

    }
}