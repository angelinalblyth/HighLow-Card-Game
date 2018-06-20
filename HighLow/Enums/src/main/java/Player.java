import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;
    private int handValue;


    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<Card>();
        this.handValue = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getHand() {
        return this.hand.size();
    }


    public void addCardToHand(Deck deck, Card card) {
        // find first card in deck
        card = deck.dealCard();
        // assigned card to player's hand
        this.hand.add(card);
    }
}
