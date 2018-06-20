import java.util.ArrayList;

public class Game {

    private ArrayList<Game> players;
    private String deck;

    public Game(){
        this.players = new ArrayList<Game>();
        this.deck = deck;
    }


    public int playersInGame() {
        return this.players.size();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }
}
