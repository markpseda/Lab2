package mainPackage;

import java.util.ArrayList;

public class Hand {
	private ArrayList<Card> hand = new ArrayList<Card>();
	private int handsize = 5;
	
	public Hand(Deck deckName) {
		super();
		for(int i = 0; i< handsize; i++){
			hand.add(deckName.drawCard());
		}
	}
	public static int HandStrength(){
		int handStrength = 0;
		
		//code to actually evaluate 
		
		return(handStrength);
		
	}
	
	public static Hand HandStrength(ArrayList<Hand> handList){
		Hand winner = handList.get(0);
		for(Hand hand: handList){
			if (winner.HandStrength() < hand.HandStrength()){
				winner = hand;
			}
		}
		
		return(winner);
	}
}

