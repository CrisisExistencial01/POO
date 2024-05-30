package JuegoDados;

public class Dado {
    private int valor;
    public Dado(){ }

    public void lanzar() {
        this.valor = genRandom();
    }

    public int genRandom() {
        // generate random int between 1 and 6
        java.util.Random rand = new java.util.Random();
        return rand.nextInt(6) + 1;
    }
    public int getValor() {
        return this.valor;
    }
}
