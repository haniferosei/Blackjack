import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cards cards = new Cards(7, 3);
        System.out.println(cards);
        System.out.println(cards.getValue());

        Deck deck = new Deck();
        System.out.println(deck);
        System.out.println();

        int number = 3;
        if (args.length > 1) {
            number = Integer.parseInt(args[0]);                             //check the size of the command line arguments
        }
        if (number < 2 || number > 6) {
            System.out.println("Minimum number of players is 2 and the maximum is 6");
            return;
        }

        ArrayList<Players> players = new ArrayList<>();
        for (int p = 0; p < number; p++) {
            Players player1 = new Players("Joe", List.of(deck.pack.pop(), deck.pack.pop()));
            players.add(player1);

        }
        System.out.println(players);
        System.out.println(deck.pack.size());
        Boolean game = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Press 1 to HIT, Press 2 to STICK");
        while (game) {
            for (Players player : players) {
                System.out.println("HIT or STICK");

                int input = scan.nextInt();
                if (input == 1) {
                    List<Cards> something = player.getCardsHeld()== null ? new ArrayList<>() :  player.getCardsHeld();    //ternary operator4

//                      playercard.add(deck.pack.pop());
//                      player.setCardsHeld(playercard);
                    Cards cardName = deck.pack.pop();
                    something.add(cardName);
//                      playercard.add(cardName);
                    System.out.println(cardName);

                }


            }

        }
    }


}
