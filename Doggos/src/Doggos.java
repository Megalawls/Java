import java.util.ArrayList;

public class Doggos {
	String name;
	int position;
	
	public Doggos(String name, int position) {
		super();
		this.name = name;
		this.position = position;
	}



	public static void main(String[] args) {
		ArrayList<Doggos> doggoCompetition = new ArrayList<Doggos>();
		int count = 1;
		do
		{
			doggoCompetition.add(new Doggos("Doggo"+count, count));
			count++;
		}
		while(doggoCompetition.size() <100);
		
		System.out.println(doggoCompetition.size());
		
		
		for (Doggos d : doggoCompetition){
			System.out.println(d.name + " is in " +d.position);
		}
	}
	}
	
