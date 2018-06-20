import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
        createDeck();
    }

    public void createDeck(){
        for(SuitType suit: SuitType.values()){
            for(RankType rank: RankType.values()){
                Card card = new Card(suit, rank);
                cards.add(card);
            }
        }
    }

    public int deckCount() {
        return cards.size();
    }



    public void shuffle() {
        Collections.shuffle(cards);
    }


    public Card dealCard() {
       return cards.get(0);
    }
}
