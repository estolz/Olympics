package olympic;
import java.util.ArrayList;
import java.util.List;
public class Composite implements Olympic{
  List<Olympic> olTeams=new ArrayList<>();
  
  public void add(Olympic Team) {
	  olTeams.add(Team);
  }
  public void print() {
	  for(Olympic Team:olTeams) {
		  Team.print();
	  }
	  System.out.print("\n"+"----------------------------");
	 }
  public void printGold() {
	  for(Olympic Team:olTeams) {
		  Team.print();
		  if(Team instanceof Sports) {
			   ((Sports) Team).printGold();
		  }
	  }
	  System.out.print("\n"+"----------------------------");
  }
}
