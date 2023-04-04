package chapter7.test;

class SutdaDeck {

	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for(int i=0; i<cards.length; i++) {
			int num = i%10+1;
			boolean isKwang = (num<=10 && (num==3)||(num==1)||(num==8));

			cards[i] = new SutdaCard(num, isKwang);
		}
	}

	void shuffle() {
		for(int i=0; i<cards.length; i++) {
			int j = (int)(Math.random()*cards.length);
			
			SutdaCard tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
	
	SutdaCard pick(int index) {
		if(index>=CARD_NUM || index<0)
			return null;
		return cards[index];
	}
	
	SutdaCard pick() {
		int index = (int)(Math.random()*cards.length);
		return pick(index);
	}



}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard(){
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}

	@Override
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
	
	
}

public class SutdaDeckMain {

	public static void main(String[] args) {

		SutdaDeck deck = new SutdaDeck();

		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ",");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));
	}
}

