package olympic;

public class Sports extends Teams{
	String Name;
	int Ath;
	int Gold;
	 Sports(String Name,int Ath,int Gold) {
		super(Name);
		this.Name=Name;
		this.Ath=Ath;
		this.Gold=Gold;
	}

	public void print() {
	    	System.out.print("\n"+Name+", Number of Athletes: "+Ath+" ,");
	    }
	public void printGold() {
		System.out.print("Number of Golden medals: "+Gold);
	}
	
}
