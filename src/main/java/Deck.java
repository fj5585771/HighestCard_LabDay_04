import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<Card>();

        for (SuitType suittype : SuitType.values()) {  // basically a forEach loop
            for (RankType rank : RankType.values()) {
                Card card = new Card(suittype, rank);
                this.deck.add(card);
            }
        }

        //             for(int i=0; i<deck.size(); i++) {
//             System.out.println(deck.cards.get(i).toString());
//             }

//            for (int a = 0; a <=; a++) {
//                for (int b = 0; b <= 12; b++) {
//                    deck.add(new Card(SuitType.CLUBS, RankType.FIVE));
//                }
//            }

    }

    public int countCards(){
        return this.deck.size();
    }

}



