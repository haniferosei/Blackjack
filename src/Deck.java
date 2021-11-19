import java.util.ArrayList;
    public class Deck {
        private ArrayList<Card> cards;

        public Deck() {
            cards = new ArrayList<Card>();
            fill();
        }

        private void fill() {
            for (int rank = 2; rank <= 14; rank++)
                for (int suit = 0; suit <= 3; suit++)
                    cards.add(new Card(rank, suit));

                shuffle();
        }
         private void shuffle(){
            ArrayList<Card> temp = new ArrayList<Card>();

            while(cards.size() >0){
                int i = (int) (Math.random() * cards.size());
                temp.add(cards.get(i));
                cards.remove(i);
            }

           cards = temp;
}


     public Card deal(){
            if(cards.size() ==0)
                fill();
         return cards.remove(0);
     }
        @Override
        public String toString() {
            return "Deck{" +
                    "cards=" + cards +
                    '}';
        }
    }



