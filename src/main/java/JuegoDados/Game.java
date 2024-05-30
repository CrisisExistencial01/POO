package JuegoDados;

public class Game {
    private Dado dado1;
    private Dado dado2;

    public Game() {
        this.dado1 = new Dado();
        this.dado2 = new Dado();
    }
    public boolean esGanador(int dado1, int dado2) {
        return Calculadora.sumar(dado1, dado2)==7;
    }
    public void jugar() {
        this.dado1.lanzar();
        this.dado2.lanzar();
        int suma = Calculadora.sumar(this.dado1.getValor(), this.dado2.getValor());
        System.out.println("Dado 1: " + this.dado1.getValor());
        System.out.println("Dado 2: " + this.dado2.getValor());
        System.out.println("Suma: " + suma);

        String resultado = (Calculadora.sumar(this.dado1.getValor(), this.dado2.getValor()) == 7) ? "You win!!!" : "You lose!!!";
        System.out.println(resultado);
    }
}
