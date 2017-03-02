package example.codeclan.com.newcardgame;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by user on 02/03/2017.
 */

public class TestDeck {

    Deck deck;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void testDeckHas52Cards() {
        assertEquals(52, getNumberOfCards());
    }

    @Test
    public void testRemoveCard() {

    }
}
