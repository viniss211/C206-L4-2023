import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Scanner entra = new Scanner(System.in);

    boolean controla = true;
    Cantina inatelCantina = new Cantina();

    inatelCantina.nome = "cantininha";

    Salgado salgado = new Salgado();
    while (controla){
        System.out.println("Sistema de cadastramento de salgados");
        System.out.println("1- salgado novo");
        System.out.println("2- mostra salgados");
        System.out.println("3- sair");

        int opcao = entra.nextInt();

        entra.nextLine();

        switch (opcao) {
            case 1 -> {
                System.out.println("Entre com seu salgado");
                salgado.nome = entra.nextLine();
                inatelCantina.addSalgado(salgado);
            }
            case 2 -> inatelCantina.mostraInfo();
            case 3 -> controla = false;
            default -> System.out.println("Opção invalida");
        }
    }
    }
}