import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import JuegoDados.Game;
public class TestGame {
    private Game game;
    @Before
    public void setUp() {
        game = new Game();
    }
    @Test
    public void testEsGanador() {
        assertTrue(game.esGanador(3, 4));
        assertFalse(game.esGanador(1, 1));
    }
    @Test
    public void testJugar() {
        game.jugar();
    }

}
