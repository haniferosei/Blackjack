import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.stream.Stream;

public class Deck {
    Stack<Cards> pack;

    public Deck() {


        pack = new Stack<>();
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 0; rank <= 12; rank++) {
                pack.push(new Cards(rank, suit));
            }
        }
        Collections.shuffle(pack);
    }





    @Override
    public String toString() {
        return "Deck{" +
                "pack=" + pack +
                '}';
    }

    public int size() {
        return pack.size();
    }


}
