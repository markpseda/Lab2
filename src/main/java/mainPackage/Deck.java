package mainPackage;
import java.util.ArrayList;
import java.util.Collections;

import eNums.eRank;
import eNums.eSuit;

public class Deck {
	private ArrayList<Card> deck = new ArrayList<Card>();

	public Deck() {
		super();
		for(int i = 0; i <= 3; i++){
			eSuit suit = eSuit.values()[i];
			for(int j = 2; j <= 14; j++){
				eRank rank = eRank.values()[j];
				Card newCard = new Card(rank, suit);
				deck.add(newCard);
			}
		}
		Collections.shuffle(deck);
	}
	
	public Card drawCard(){
		return deck.remove(0);
	}
	
	public int cardsRemain(){
		int size = deck.size();
		return(size);
	}
	
	
	
	

}
