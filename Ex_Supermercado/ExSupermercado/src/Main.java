import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Supermercado supermercado1 = new Supermercado();

        //declaração dos atributos do mercado
        supermercado1.nome = "Mercadinho";
        supermercado1.cnpj = "0000000000";
        supermercado1.endereco = "Rua taltal";
        supermercado1.numTelefone = "35999999999";

        //Criando o menu
        boolean controle = true;

        while (controle) {
            System.out.println("BEM VINDO AO SISTEMA DE CADASTRO DO " + supermercado1.nome);
            System.out.println("1- ADD PRODUTO");
            System.out.println("2- MOSTRAR INFOS");
            System.out.println("3- MOSTRAR QTD DE CATEGORIAS");
            System.out.println("4- PREÇO DOS PRODUTO (MAIS CARO -> MAIS BARATO)");
            System.out.println("5- SAIR");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    Produto produto = new Produto();
                    System.out.println("Nome: ");
                    produto.nome = sc.nextLine();
                    System.out.println("Quantidade: ");
                    produto.quantidade = sc.nextInt();
                    System.out.println("Código: ");
                    produto.codigoSerie = sc.nextInt();
                    sc.nextLine(); // LIMPANDO O BUFFER
                    System.out.println("Categoria: ");
                    produto.categoria = sc.nextLine();
                    System.out.println("Valor: ");
                    produto.valor = sc.nextDouble();

                    //Adicionando produto ao sistema
                    supermercado1.addProduto(produto);
                    break;
                case 2:
                    supermercado1.mostraInfo();
                    break;
                case 3:
                    supermercado1.contarCategorias();
                    break;
                case 4: //ordem do mais barato para o mais caro
                    supermercado1.mostrarMaisCaroBarato();
                    break;
                case 5: //caso de saida
                    controle = false;
                    break;
                default: // caso que o usuario usa uma entrada errada
                    System.out.println("Valor invalido");
                    break;
            }
        }
    }
}
