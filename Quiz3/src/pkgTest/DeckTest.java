package pkgTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgCore.Card;
import pkgCore.Deck;
import pkgException.DeckException;

class DeckTest {

	@Test
	void getRemaining_Test1() throws DeckException {
		Deck d = new Deck();
		Card c = d.Draw();
		int i = d.getRemaining(c.geteRank());
		
		assertTrue(i==3);
	}
	
	@Test
	void getRemaining_Test2() throws DeckException {
		Deck d = new Deck();
		Card c = d.Draw();
		int i = d.getRemaining(c.geteSuit());
		
		assertTrue(i==12);
	}

}
