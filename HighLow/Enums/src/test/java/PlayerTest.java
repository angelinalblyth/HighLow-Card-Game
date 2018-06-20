import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player1;
    Player player2;
    Card card;
    Deck deck;

    @Before
    public void setUp() throws Exception {
        player1 = new Player("Ben");
        player2 = new Player("Bill");

        deck = new Deck();
    }

    @Test
    public  void playerHasNoCards(){
        assertEquals(0, player1.getHand());
    }

    @Test
    public void playerHasCard(){
        player1.addCardToHand(deck,card);
        assertEquals(1, player1.getHand());
    }




}
