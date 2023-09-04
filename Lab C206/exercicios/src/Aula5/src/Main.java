import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Escola stAngela = new Escola();
        //Entrada de dados
        Scanner sc = new Scanner(System.in);

        //Criando o objeto da escola
        Escola escola = new Escola();

        escola.nome = "Inatel";
        escola.endereco = "Rua sla";
        escola.email = "inatel.br@.com";
        escola.numTelefone = 41554135;


        //Criando o menu
        boolean controle = true;

        while (controle){
            System.out.println("BEM VINDO AO SISTEMA DE CADASTRO DA ESCOLA");
            System.out.println("1- ADD ALUNOS");
            System.out.println("2- MOSTRAR INFOS");
            System.out.println("3- MOSTRAR QTD ALUNOS POR ANO");
            System.out.println("4- SAIR");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){

                case 1:
                    Estudante aluno = new Estudante();
                    System.out.println("Nome: ");
                    aluno.nome = sc.nextLine();
                    System.out.println("Idade: ");
                    aluno.idade = sc.nextInt();
                    sc.nextLine(); // LIMPANDO O BUFFER
                    System.out.println("Ano de matricula: ");
                    aluno.ano = sc.nextLine();

                    //Adicionando o aluno a escola

                    escola.addEstudante(aluno);
                    break;
                case 2:
                    escola.mostrarInfo();
                    break;
                case 3:
                    escola.qtdEstudantesAoAno();
                    break;
                case 4: //caso de saida
                    controle = false;
                    break;
                default: // caso que o usuario usa uma entrada errada
                    System.out.println("Valor invalido");
                    break;
            }
        }

    }
}