import java.util.Scanner;

public class Exercicio3Relatorio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float gasolina = 6f;
        float alcool = 4.90f;

        //Entra de dados
        System.out.println("Quantos litros de combustível?");
        float litros = entrada.nextInt();
        while (litros <= 0){ //estrutura que não permite valores <= 0 para litros
            System.out.println("Quantos litros de combustível?");
            litros = entrada.nextInt();
        }
        System.out.println("Qual combustível? 'G' para gasolina e 'A' para alcool");
        entrada.nextLine(); //Limpeza do buff pra n ter problema de entrar com um int ou float e em seguida string
        String combustivel = entrada.nextLine();

        switch (combustivel) { //estrutura de decisão que calculará o desconto e preço total de acordo com a quantidade de litros e tipo de combustível
            case "G":
                if (litros <= 20) {
                    System.out.println("Preco total: ");
                    System.out.println(gasolina * litros - (gasolina * litros * 0.04));
                }
                else {
                    System.out.println("Preco total: ");
                    System.out.println(gasolina * litros - (gasolina * litros * 0.06));
                }
                break;
            case "A":
                if (litros <= 20) {
                    System.out.println("Preco total: ");
                    System.out.println(alcool * litros - (alcool * litros * 0.03));
                }
                else {
                    System.out.println("Preco total: ");
                    System.out.println(alcool * litros - (alcool * litros * 0.05));
                }
                break;
            default: //default que será executado quando o usuário não entrar com A ou G
                System.out.println("Opção Inválida");
                break;
        }
    }
}
