
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DeckTest {

    Card card;
    Deck deck;

    @Before
    public void before(){
        card = new Card(SuitType.SPADES, RankType.ACE);
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.countCards());
    }

    @Test
    public void deckIsFull(){
        deck.addCardsToDeck();
        assertEqual(52, deck.countCards());

    }
}


