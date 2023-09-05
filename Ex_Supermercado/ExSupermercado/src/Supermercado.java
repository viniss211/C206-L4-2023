public class Supermercado {
    //Atributos do mercado
    String nome;
    String cnpj;
    String endereco;
    String numTelefone;
    double aux; //Variavel auxiliar para apresentação dos valores mais caros para baratos
    //Agregação da classe produto
    Produto[] produtos = new Produto[30];

    void addProduto(Produto novoProduto) { //método adição de produtos
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == null) {
                produtos[i] = novoProduto;
                break;
            }
        }
    }

    void mostrarMaisCaroBarato() { //Método mais caro p/ mais barato
        for (int i = 0; i < produtos.length; i++) {
            for (int j = i; j < produtos.length; j++) {
                if (produtos[i] != null) {
                    if (produtos[j] != null) {
                        if (produtos[i].valor < produtos[j].valor) {
                            aux = produtos[i].valor;
                            produtos[i].valor = produtos[j].valor;
                            produtos[j].valor = aux;
                        }
                    }
                }
            }
        }

        System.out.println("Valor dos produtos do mais caro para o mais barato");
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null) {
                System.out.println(produtos[i].valor);
            }
        }

    }

    void contarCategorias() { //Método das categorias
        //Categorias
        int higiene = 0;
        int utensilios = 0;
        int alimenticios = 0;
        for (int i = 0; i < produtos.length; i++) {
            //verifica se a posição está preenchida
            if (produtos[i] != null) {
                if (produtos[i].categoria.equalsIgnoreCase("Higiene"))
                    higiene++;
                else if (produtos[i].categoria.equalsIgnoreCase("Utensilios")) {
                    utensilios++;
                } else
                    alimenticios++;
            }
        }

        System.out.println("Higiene: " + higiene);
        System.out.println("Utensilios: " + utensilios);
        System.out.println("Alimenticios: " + alimenticios);

    }

    void mostraInfo() { //método que mostra dados de tds produtos
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null) {
                System.out.println("Descricao do produto:" + i);

                produtos[i].mostrarInfos();
            }
        }
    }
}
