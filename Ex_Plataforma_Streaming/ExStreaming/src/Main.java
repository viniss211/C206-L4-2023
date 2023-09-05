import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Plataforma netflix = new Plataforma();

        netflix.nome = "Netflix";

        //Criando o menu
        boolean controle = true;
        System.out.println("BEM VINDO AO SISTEMA DE CADASTRO DA " + netflix.nome);

        while (controle) {
            System.out.println("1- ADD SERIE");
            System.out.println("2- MOSTRAR INFOS");
            System.out.println("3- SERIE MAIS LONGA FINALIZADA");
            System.out.println("4- MÉDIA PORCENTAGEM");
            System.out.println("5- SAIR");


            int opcao = sc.nextInt();
            sc.nextLine();
            String maisLonga;
            switch (opcao) {

                case 1:
                    Serie serie = new Serie();
                    System.out.println("Título: ");
                    serie.nome = sc.nextLine();
                    System.out.println("Diretor: ");
                    serie.diretor.nome = sc.nextLine();
                    System.out.println("N° Temporadas: ");
                    serie.temporadas = sc.nextInt();
                    System.out.println("Nota: ");
                    serie.nota = sc.nextDouble();
                    System.out.println("Finalizada?(true para sim e false para não) ");
                    serie.finalizada = sc.nextBoolean();
                    //Adicionando serie ao sistema
                    netflix.addSerie(serie);
                    break;
                case 2:
                    netflix.mostraInfo();
                    break;
                case 3:
                    maisLonga=netflix.serieMaisLongaFinalizada();
                    System.out.println(maisLonga);
                    break;
                case 4:
                    netflix.mediaPorcentagem();
                    break;
                case 5:
                    controle = false;
                    break;
                default:
                    System.out.println("Valor invalido");
                    break;

            }
        }
    }
}