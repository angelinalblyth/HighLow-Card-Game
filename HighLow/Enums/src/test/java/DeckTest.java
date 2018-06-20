import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class DeckTest {

    Deck deck;

    @Before
    public void setUp() {
        deck = new Deck();
    }

    @Test
    public void checkDeckCount(){
        assertEquals(52, deck.deckCount());
    }

    @Test
    public void checkPreshuffle(){
        Card card = deck.dealCard();
        assertEquals(SuitType.HEARTS, card.getSuit());
        assertEquals(RankType.ACE, card.getRank());
    }

    @Test
    public void checkPostShuffle(){
        deck.shuffle();
        Card card = deck.dealCard();
        assertNotEquals(SuitType.HEARTS, card.getSuit());
        assertNotEquals(RankType.ACE, card.getRank());
    }
}
