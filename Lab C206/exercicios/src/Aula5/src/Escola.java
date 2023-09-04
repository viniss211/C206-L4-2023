public class Escola {
    String nome;
    String email;
    int numTelefone;
    String endereco;
    Estudante estudante;
    Estudante[] estudantes = new Estudante[310]; //array de exemplo

    void addEstudante(Estudante e) {
        for (int j = 0; j < estudantes.length; j++) {
            //verificando j esta vazia
            if (estudantes[j] == null) {
                estudantes[j] = e;
                break; //garantindo que parou e não vai add o mesmo valor dnv
            }
        }
    }

    void mostrarInfo() { //método que mostra dados de tds estudantes
        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] != null) {
                estudantes[i].mostrarInfo();
            }
        }
    }

    void qtdEstudantesAoAno() {
        //variaveis contadoras
        int alunosPrimeiro = 0;
        int alunosSegundo = 0;
        int alunosTerceiro=0;

        for (int i = 0; i < estudantes.length ; i++) {
            //verifica se a posição está preenchida
            if (estudantes[i] != null){
                if (estudantes[i].ano.equalsIgnoreCase("Primeiro"))
                    alunosPrimeiro++;
                else if (estudantes[i].ano.equalsIgnoreCase("Segundo")) {
                    alunosSegundo++;
                }
                else
                    alunosTerceiro++;
            }
        }

        System.out.println("Primeiro: " + alunosPrimeiro);
        System.out.println("Segundo: " + alunosSegundo);
        System.out.println("Terceiro: " + alunosTerceiro);
    }

}
