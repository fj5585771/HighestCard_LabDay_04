import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();

        for (SuitType suit : SuitType.values()) { // basically a forEach loop
            for (RankType rank : RankType.values()) {
                Card card = new Card(suit, rank);
                this.cards.add(card);
            }
        }

        Collections.shuffle(this.cards);


//            for ( int i=0 ; i < cards.values() ; i++ ) {
//        System.out.println(cards.get(i).toString());
//    }

//            for (int a = 0; a <=; a++) {
//                for (int b = 0; b <= 12; b++) {
//                    cards.add(new Card(SuitType.CLUBS, RankType.FIVE));
//                }
//            }

    }

    public int countCards() {
        return this.cards.size();
    }

}



