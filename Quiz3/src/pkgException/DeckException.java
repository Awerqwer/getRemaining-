package pkgException;

import pkgCore.Deck;

public class DeckException extends Exception {

	private Deck d1;

	public DeckException(Deck d1) 
	{
		super();
		this.d1 = d1;
	}

	protected Deck getD() 
	{
		return d1;
	}
	
}