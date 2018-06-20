import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Player player1;
    Player player2;

    @Before
    public void setUp() throws Exception {
        game = new Game();

        player1 = new Player("Ben");
        player2 = new Player("Bill");
    }

    @Test
    public void testNoPlayersInGame() {
    assertEquals(0, game.playersInGame());
    }

    @Test
    public void addPlayers(){
        game.addPlayer(player1);
        assertEquals(1, game.playersInGame());
    }
}
