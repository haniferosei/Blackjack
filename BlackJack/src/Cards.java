import java.util.HashMap;
import java.util.Map;

public class Cards {


private int rank,suit;

    String[] ranks = {"2","3","4","5","6","7","8","9","10","jack","queen","king","ace"};
    String[] suits = {"♥", "♦", "♣", "♠"};

    public Cards(int rank, int suit) {
        this.suit = suit;
        this.rank = rank;
    }

    public  int getRank(){
       return rank;
    }

    public  int getValue(){

        if(rank <=8)
        return rank + 2;

        if(rank ==12)
            return 11;

        return 10;
    }

    public String toString() {
        return  ranks [rank] + suits[suit];

    }



}
