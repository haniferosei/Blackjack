import java.util.ArrayList;
import java.util.List;

public class Players{
    public void setCardsHeld(List<Cards> cardsHeld) {
        this.cardsHeld = cardsHeld;
    }

    public Players(String name, List<Cards> cardsHeld) {
        this.name = name;
        this.cardsHeld = cardsHeld;
    }

    public String getName() {
        return name;
    }

    public List<Cards> getCardsHeld() {
        return cardsHeld;
    }

    String name ;
    private List<Cards>cardsHeld ;

    //addingcards
    public void addCards(Cards cards){
        cardsHeld.add(cards);
    }

    //cards value in player's hand


    public int getValueofCardsInPlayersHand(){
        int valueInHand = 0;              //initial..will be incremented
        for(Cards card : getCardsHeld() ){
            valueInHand += card.getValue();
        }
        return valueInHand;
    }


    public void showPlayersHand(){
        System.out.println(this.getName());
        for(Cards cards : getCardsHeld()){
            System.out.println(cards.toString());
        }

//        public Cards game(){
//            Cards cards;
//        }

    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", cardsHeld=" + cardsHeld +
                '}';
    }
}








//cardsInHand=cardsHeld
//getValueOfCardsInHand=getValueofCardsInPlayersHand
//valueofCardsInhand =  valueInHand;
//getCardsInHand = getCardsHeld
