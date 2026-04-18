package Fila.Clinica;

import java.util.Scanner;

public class TesteFilaClinica {
    public static void main(String[] args) throws FilaClinicaVazia{

        FilaClinicaArray check = new FilaClinicaArray(); 
        int opcao;
        Scanner scanner = new Scanner(System.in); //lê o teclado
        do {    
            System.out.println("1 - Nome de um novo paciente");
            System.out.println("2 - Próximo paciente que vai ser atendido");
            System.out.println("3 - Quantidade de pacientes na espera");
            System.out.println("4 - FIM");
            opcao = scanner.nextInt(); //espera a digitação 
            System.out.println("Escolha: " + opcao);

            switch (opcao) {
                case 1:
                    scanner.nextLine(); //tira o numero no terminal
                    String nome = scanner.nextLine(); 
                    check.enqueue(nome);
                    System.out.println("Paciente " + nome + " adicionado!");
                    break;
            
                case 2:
                    System.out.println("Próximo é: " + check.dequeue());   
                    break;

                case 3:
                    System.out.println("Pacientes na espera: " + check.size());
                    break;
            } 

        } while (opcao != 4); //porque vai ler depois
        
    }
}
