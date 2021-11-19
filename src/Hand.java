import java.util.ArrayList;

public class Hand {

    private ArrayList<Card>cards;

    public Hand() {
        cards = new ArrayList<Card>();
    }

        public void hit(Card card){
         cards.add(card);
        }

        public int getValue(){
        int value = 0;
        int aces = 0;
        for(Card card : cards){
            value += card.getValue();
            if(card.getRank()== 14)
                aces++;
        }

        while (value > 21 && aces >0){
            value -= 10;
            aces--;
        }
        return  value;
        }

        public ArrayList<Card>getCards(){
        return cards;
        }
        public boolean isBusted(){
        return  getValue() >21;
        }

        public boolean has21(){
        return  getValue() ==21;
        }

        public boolean hasBlackJack(){
        return has21() && cards.size() ==2;
        }


    public boolean canDoubleDown(){
        return cards.size() ==2;
    }
    public boolean canSplit(){
        return cards.size() ==2 && cards.get(0).getRank() ==cards.get(1).getRank();
    }
     public String toString(){
        return cards+": ("+ getValue() +" )";
    }
}
