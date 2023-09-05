public class Serie {
    Diretor diretor;
    public Serie(){
        diretor = new Diretor();
    }
    String nome;
    double nota;

    int temporadas;
    boolean finalizada;

    void mostraInfo(){
        System.out.println("Título: "+ nome);
        System.out.println("Diretor:"+diretor.nome);
        System.out.println("Nota: "+nota+"/10");
        System.out.println("Temporadas: "+temporadas);
        if (finalizada)
            System.out.println("Finalizada: Sim");
        else
            System.out.println("Finalizada: Nao");

    }
}
