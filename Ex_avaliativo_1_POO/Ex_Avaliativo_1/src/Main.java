import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente1 = new Cliente();
        boolean controle = true; //variavel para controle do sistema
        int promocoes; //variavel para os casos do switch da loja
        Computador pc1 = new Computador();
        Computador pc2 = new Computador();
        Computador pc3 = new Computador();


        System.out.println("Cadastro - PC Mania");
        System.out.println("Porfavor , me diga seu nome: ");
        cliente1.nome = sc.nextLine();
        System.out.println("Porfavor , me diga seu CPF: ");
        cliente1.cpf = sc.nextLong();
        System.out.println("Bem vindo A PC MANIA!");
        System.out.println("Seu cadastro foi realizado " + cliente1.nome + "!");

        while (controle) {
            System.out.println("O que faremos agora?");
            promocoes = sc.nextInt();
            switch (promocoes) {
                case 0:
                    controle = false;
                    break;
                case 1:
                    System.out.println("Item adicionado ao carrinho!");
                    break;
                case 2:
                    System.out.println("Item adicionado ao carrinho!");
                    break;
                case 3:
                    System.out.println("Item adicionado ao carrinho!");
                    break;
                default:
                    break;
            }
        }

    }
}