public class MainK {
    public static void main(String[] args) {

        Kart amarelo = new Kart();
        amarelo.motor.velocidadeMaxima = 200;
        amarelo.motor.cilindradas = "50";

        amarelo.nome = "Possante";
        Piloto piloto1 = new Piloto();
        amarelo.pilotinho = piloto1;
        amarelo.pilotinho.nome = "Wario";
        amarelo.pilotinho.vilao = true;
        amarelo.pilotinho.soltaSuperPoder();
        amarelo.pular();
        //Motor motr = new Motor(); Fazer essa linha está errado pois o kart ja possui um motor

        amarelo.soltarTurbo();
        amarelo.motor.mostraInfo();
    }
}
