
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.countCards());
    }

    @Test
    public void deckIsFull(){
        assertEquals(52, deck.countCards());
    }
}


