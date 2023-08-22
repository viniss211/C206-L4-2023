import java.util.Scanner;

public class Exercicio2Relatorio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com duas notas");

        float np1 = entrada.nextFloat();
        float np2 = entrada.nextFloat();
        float media;

        media = (np2+np1)/2f;

        int mediaConvertida = (int) Math.round(media);

        System.out.println("Nota final: " + mediaConvertida);
    }
}
