package olympic;

public class Nations extends Continents{
	String Name;
	Nations(String Name){
		super(Name);
		this.Name=Name;
	}

	@Override
	public void print() {
		System.out.print("\n"+Name+":");
		
	}

}
