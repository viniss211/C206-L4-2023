import java.util.Scanner;

public class Exercicio1Relatorio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com dois números");

        float n1 = entrada.nextFloat();
        float n2 = entrada.nextFloat();
        entrada.nextLine(); //Limpeza do buff pra n ter problema de entrar com um int ou float e em seguida string
        System.out.println("Entre com o caracter indicado para cada operação matemática");
        System.out.println("Soma: +");
        System.out.println("Subtração: -");
        System.out.println("Produto: *");
        System.out.println("Divisão: /");
        System.out.println("Exponenciação: ^");


        String operador = entrada.nextLine();

        switch (operador) {
            case "+":
                System.out.printf(n1 + "+" + n2 + " = ");
                System.out.println(n1 + n2);
                break;
            case "-":
                System.out.printf(n1 + "-" + n2 + " = ");
                System.out.println(n1 - n2);
                break;
            case "*":
                System.out.println(n1 + "*" + n2 + " = " + n1 * n2);
                break;
            case "/":
                System.out.println(n1 + "/" + n2 + " = " + n1 / n2);
                break;
            case "^":
                System.out.println(n1 + "^" + n2 + " = " + Math.pow(n1, n2));
                break;
            default:
                System.out.println("Caracter inválido");
                break;

        }


    }
}