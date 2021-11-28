package olympic;

public class Teams extends Nations{
	String Name;
	Teams(String Name){
		super(Name);
		this.Name=Name;
	}
    public void print() {
    	System.out.print("\n"+"-"+Name);
    }
}
