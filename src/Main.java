public class Main {
    public static void main(String[] args) {
        Card cards = new Card(7, 3);
        System.out.println(cards);
        System.out.println(cards.getValue());

        Deck deck = new Deck();
        System.out.println(deck);
        System.out.println(deck.deal());

        Hand hand = new Hand();
        System.out.println(hand);

        hand.hit(deck.deal());
        System.out.println(deck);
        System.out.println(hand);

        hand.hit(new Card(3,4));
        hand.hit(new Card(4,5));
        hand.hit(new Card(5,2));
        System.out.println(hand);
        System.out.println(hand.canDoubleDown());
        System.out.println(hand.canSplit());

        Player player = new Player("Jen");
        System.out.println(player);

        player.hit(new Card(14,3));
        player.hit(new Card(3,3));
        System.out.println(player);


    }
}
