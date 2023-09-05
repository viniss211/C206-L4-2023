public class Plataforma {
    String nome;
    Serie[] series = new Serie[30];

    void mostraInfo() { //método que mostra dados de tds dados de serie
        for (int i = 0; i < series.length; i++) {
            if (series[i] != null) {
                System.out.println("Descricao da Serie:" + i);

                series[i].mostraInfo();
            }
        }
    }

    void addSerie(Serie novaSerie) {
        for (int i = 0; i < series.length; i++) {
            if (series[i] == null) {
                series[i] = novaSerie;
                break;
            }
        }
    }

    String serieMaisLongaFinalizada() {
        int maior = -1;
        String maisLonga = null;
        int j = 0; //Auxiliar para encontrar a serie mais longa
        if (series == null) {
            return "Nenhuma serie catalogada";
        } else {
            for (Serie serie : series) {
                if (serie != null && serie.finalizada) {
                    if (serie.temporadas > maior) {
                        maior = serie.temporadas;
                        maisLonga = serie.nome;
                    }
                }
            }

        }
        if (maisLonga == null)
            return "Nenhuma seria finalizada cadastrada";
        else
            return "Seria finalizada com maior numero de temps: " + maisLonga;

    }

    void mediaPorcentagem() {
        double contaSeries3 = 0;
        double contaSeriesTotal=0;
        double acumulaNota= 0;
        for (int i = 0; i <series.length ; i++) {

            if (series[i] != null && series[i].temporadas >= 3) {
                contaSeries3 ++;
                contaSeriesTotal++;

                acumulaNota += series[i].nota;
            }
                else if(series[i] != null){
                contaSeriesTotal++;
            }

        }

        System.out.println(contaSeries3*100/contaSeriesTotal + "% das séries cadastradas possuem mais de 3 temporadas");
        System.out.println(acumulaNota/contaSeries3 + " é a média aritiméticas das notas delas");
    }
}
