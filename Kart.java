// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Kart {
    String nome;

    Motor motor;

    public Kart(){
        motor = new Motor();
    }
    Piloto pilotinho;
    void pular(){
        System.out.println("O Kart de " + pilotinho.nome + " está nos ares!" );
    }

    void soltarTurbo(){
        System.out.println(pilotinho.nome + " Ligou o turbo do " + nome);
    }

    void fazerDrift(){
        System.out.println("Driiiiiift");
    }

}