package eNums;

public enum eSuit {
	HEARTS(0),
	SPADES(1),
	CLUBS(2),
	DIAMONDS(3);
	
	private int iSuit;
	
	private eSuit(int iSuit){
		this.iSuit = iSuit;
	}

	public int getiSuit() {
		return iSuit;
	}
	
}
