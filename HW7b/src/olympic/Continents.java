package olympic;

public class Continents implements Olympic{
	String Name;
	Continents(String Name){
		this.Name=Name;
	}

	@Override
	public void print() {
		System.out.print("\n"+"~"+Name+":");
		
	}

}
