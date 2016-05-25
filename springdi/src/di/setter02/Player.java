package di.setter02;


public class Player implements AbstractPlayer{
	AbstractDice d;
	int totalValue;
	
	public Player(){
		
	}
	
	public Player(Dice d) {
		super();
		this.d = d;
	}
	
	public AbstractDice getD() {
		return d;
	}

	public void setD(AbstractDice d) {
		this.d = d;
	}

	public void play(){
		totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}
	
	public int getTotalValue(){
		return totalValue;
	}
}
