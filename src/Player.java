import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Hand>hands;

    public Player(String name) {
        this.name = name;
        reset();
    }
    public  void reset(){
        hands = new ArrayList<Hand>();
        hands.add(new Hand());
    }


    public String getName() {
        return name;
    }



    public ArrayList<Hand> getHands() {
        return hands;
    }

    public void  hit(Card card){
        hit(0,card);
    }
    public  void hit(int i, Card card){
        hands.get(i).hit(card);
    }
    public  String toString(){
        return  name + ": "+ hands ;
    }
}
