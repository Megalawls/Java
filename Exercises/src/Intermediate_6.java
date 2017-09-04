class Paint{
	int litresInCan;
	double canPrice;
	int coveragePerLitre;
	
	void spillPaint(){
		System.out.println("You dun goofed");
	}
	public int coveragePerCan(){
		 return (litresInCan * coveragePerLitre);
	}
	public double costPerLitre(){
		return (canPrice/litresInCan);
	}
	public double costPerMetreCovered(){
		return ((canPrice/litresInCan)/coveragePerLitre);
	}
	
	public Paint(int litresInCan, double canPrice, int coveragePerLitre) {
		super();
		this.litresInCan = litresInCan;
		this.canPrice = canPrice;
		this.coveragePerLitre = coveragePerLitre;
	}
	
	public void priceForRoom(double area){		//Shows the price for cans to paint a room with a given area of an instance of paint			
		double numberCans = (area / coveragePerCan());
		if (Math.round(numberCans) < numberCans){
			double cansNeeded = Math.round(numberCans + 1.00);
			double priceForCans = cansNeeded * canPrice;
			System.out.println("Cans needed = " + cansNeeded);
			System.out.println("Can Price = " + canPrice);
			System.out.println("Price for cans = " + priceForCans);
		}
		else{
			double cansNeeded = Math.round(numberCans);
			double priceForCans = cansNeeded * canPrice;
			System.out.println("Cans of needed = " + cansNeeded);
			System.out.println("Can Price = " + canPrice);
			System.out.println("Price for cans using = " + priceForCans);
			
		}
	}

	public void paintLeftover(double area){		//Shows how many cans are leftover after painting a room, along with how many discrete cans are needed		
		double numberCans = (area / coveragePerCan());
		if (Math.round(numberCans) < numberCans){
			double cansNeeded = Math.round(numberCans + 1.00);
			double cansLeftover = cansNeeded - numberCans;
			System.out.println("Cans needed = " + cansNeeded);
			System.out.println("Cans Leftover = " + cansLeftover);
		}
		else{
			double cansNeeded = Math.round(numberCans);
			double cansLeftover = cansNeeded - numberCans;
			System.out.println("Cans needed = " + cansNeeded);
			System.out.println("Cans Leftover = " + cansLeftover);
		}
	}
}

public class Intermediate_6 {
public static void main(String[] args){
	
/*	Paint cheapoMax = new Paint(20, 19.99, 10);	
	Paint averageJoes = new Paint(15, 17.99, 11);
	Paint duluxuriousPaints = new Paint(10, 25.00, 20);	*/ //Adds paints
	
	/*cheapoMax.priceForRoom(400);
	averageJoes.priceForRoom(400);
	duluxuriousPaints.priceForRoom(400);
	// The above three functions compare prices of each paint to paint a room of 400
	*/
	
	/*cheapoMax.paintLeftover(410);
	averageJoes.paintLeftover(410);
	duluxuriousPaints.paintLeftover(410);
	// The above three functions compare how much paint is left after painting a room of 410
	*/
	
	/*System.out.println(cheapoMax.costPerMetreCovered());
	System.out.println(averageJoes.costPerMetreCovered());
	System.out.println(duluxuriousPaints.costPerMetreCovered());
	//Work out which is the best choice for any room (Cheapest). I think this is what the best answer to what the question was asking
	*/
	
}}