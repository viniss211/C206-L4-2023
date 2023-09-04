public class Cantina {
    Salgado[] salgados = new Salgado[20];

    String nome;

    void addSalgado(Salgado novoSalgado){
        for (int i = 0; i < salgados.length; i++) {
            if (salgados[i] == null){
                salgados[i] = novoSalgado;
                break;
            }
        }
    }

    void mostraInfo(){
        for (int i = 0; i < salgados.length; i++) {
            if (salgados[i] != null)
                System.out.println("Salgado " + i + " "+salgados[i].nome);
        }
    }
}
