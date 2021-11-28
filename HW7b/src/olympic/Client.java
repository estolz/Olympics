package olympic;

public class Client {
	public static void main(String args[]) {//initializing eight paths
		Sports Cycling=new Sports("Cycling",15,3);
		Sports Tennis=new Sports ("Tennis",13,2);
		Sports TableTennis=new Sports("TableTennis",25,7);
		Sports Football=new Sports("Football",32,0);
		Teams GermanyMensTeam=new Teams("GermanyMens");
		Teams GermanyWomensTeam=new Teams("GermanyWomens");
		Nations GermanyTeam=new Nations("Germany");
		Continents Europe=new Continents("Europe");
		
		Sports Teakwondo=new Sports("Teakwondo",10,6);
		Sports Waterpolo=new Sports("Waterpolo",25,3);
		Sports ArtisticGymnastics=new Sports("Artistic Gymn",50,0);
		Sports Shooting=new Sports("Shooting",9,6);
		Teams ChinaWomens=new Teams("ChinaWomens");
		Teams ChinaMens=new Teams("ChinaMens");
		Nations China=new Nations("China");
		Continents Asia=new Continents("Asia");
		
		Composite GermanyMens=new Composite();// composite for 3a
		GermanyMens.add(GermanyMensTeam);
		GermanyMens.add(TableTennis);
		GermanyMens.add(Football);
		
		Composite Germany=new Composite();//composite for 3b
		Germany.add(GermanyTeam);
		Germany.add(GermanyMensTeam);
		Germany.add(TableTennis);
		Germany.add(Football);
		Germany.add(GermanyWomensTeam);
		Germany.add(Tennis);
		Germany.add(Cycling);
		
		Composite Asian=new Composite();//composite for 3c
		Asian.add(Asia);
		Asian.add(China);
		Asian.add(ChinaWomens);
		Asian.add(Teakwondo);
		Asian.add(Waterpolo);
		Asian.add(ArtisticGymnastics);
		Asian.add(ChinaMens);
		Asian.add(Shooting);
		
		Composite Olympia=new Composite();//composite for 3d
		Olympia.add(Asia);
		Olympia.add(China);
		Olympia.add(ChinaWomens);
		Olympia.add(Teakwondo);
		Olympia.add(Waterpolo);
		Olympia.add(ArtisticGymnastics);
		Olympia.add(ChinaMens);
		Olympia.add(Shooting);
		Olympia.add(Europe);
		Olympia.add(GermanyTeam);
		Olympia.add(GermanyMensTeam);
		Olympia.add(TableTennis);
		Olympia.add(Football);
		Olympia.add(GermanyWomensTeam);
		Olympia.add(Tennis);
		Olympia.add(Cycling);
		
		Germany.print();
		GermanyMens.printGold();
		Asian.printGold();
		Olympia.print();
	}

}
