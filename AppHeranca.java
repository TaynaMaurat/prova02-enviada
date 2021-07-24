package aplicativos;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import jdk.tools.jlink.internal.plugins.GenerateJLIClassesPlugin;

public class AppHeranca {

    /**
     *
     */
    private static final int _8 = 8;
    private static int qntCadastrados;

    public static int get3() {
        return _3;
    }

    public AppHeranca() {
    }

    public static <Motorista> void main(String[] args) throws InterruptedException, IOException {
        final int MAX_ELEMENTOS = 20;
        final int MAX_ERROS_CPF = 3;
        int opcao, qtdCadastrados =_8;
        Motorista[] motoristas = new Motorista[MAX_ELEMENTOS];
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\n****\nMENU\n****\n");
            System.out.println("1 - Cadastrar motorista");
            System.out.println("2 - Listar motoristas cadastrados");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = in.nextInt();
            in.nextLine(); 

            if (opcao == 1) {
                
                if (qtdCadastrados == MAX_ELEMENTOS) {
                    System.out.println("\nNão há espaço para cadastrar novos motoristas.");
                    voltarMenu(in);
                    continue;
                }

                System.out.print("Informe o Cpf: ");
                auxCpf = in.nextLine();


                for (int i = 0; i < qntCadastrados; i++){
                    if (aux.Cpf.equals(motoristas[i].getCpf())){
                        System.out.println("Encontrado motorista");
                        System.out.println("Motorista %d: %s\n" (i + 1, motorista[i].getNome());
                        System.out.println("Cpf: %s\n " , motoristas[i]getCpf());
                        System.out.println("Habilitação: %s\n", motoristas[i].getHabilitacao());
                    } else{
                        System.out.println("\nNão há motoristas cadastrados para exibir.");
                    voltarMenu(in);
                    continue;
                
                }
                
                voltarMenu(in);
                continue;
                
                }

                Motorista mot = new Motorista();

                System.out.print("Nome: ");
                ((Object) mot).setNome(in.nextLine());

                System.out.print("Habilitação: ");
                mot.setHabilitacao(in.nextLine());

                int numVezes = 0;
                do {
                    try {
                        System.out.print("CPF: ");
                    setCpf(in.nextLine());
                    } catch (InputMismatchException ex) {
                        System.out.println(ex.getMessage() + " Tente novamente.");
                        numVezes += 1;
                    }
                } while (mot.getClass() == null && numVezes < MAX_ERROS_CPF);

                
                if (mot.getClass() == null) {
                    System.out.printf("Você errou o CPF %d vezes. O programa será encerrado.", numVezes);
                    return;
                }

                motoristas[qtdCadastrados] = mot;
                qtdCadastrados = qtdCadastrados + 1;

                System.out.println("\nMotorista cadastrado com sucesso.");
                voltarMenu(in);
            } else if (opcao == 2) {
                if (qtdCadastrados == 0) {
                    System.out.println("\nNão há motoristas cadastrados para exibir.");
                    voltarMenu(in);
                    continue;
                }

                System.out.println("\nMOTORISTAS CADASTRADOS:");
                System.out.println("***********************");

                for (int i = 0; i < qtdCadastrados; i++) {
                    System.out.printf("\nMotorista %d: %s\n", (i + 1), motoristas[i].getNome());
                    System.out.printf("CPF: %s\n", motoristas[i].getClass());
                    System.out.printf("Habilitação: %s\n", motoristas[i].getHabilitacao());
                }

                voltarMenu(in);
            } else if (opcao != 0) {
                System.out.println("\nOpção inválida!");
            }
        } while (opcao != 0);

        System.out.println("Fim do programa!");

        in.close();
    }

    private static void voltarMenu(Scanner in) throws InterruptedException, IOException {
        System.out.println("\nPressione ENTER para voltar ao menu.");
        in.nextLine();

        
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            System.out.print("\033[H\033[2J");
        
        System.out.flush();
    }
}