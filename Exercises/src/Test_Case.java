import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Case {
	int litresInCan = 10;
	double canPrice = 25;
	int coveragePerLitre = 20;
	
	@Test
	public void coveragePerCan(){
		 assertEquals(200, (litresInCan * coveragePerLitre));}

	
	@Test
	public void testPriceForRoom(){		
		double numberCans = (400 / 200);
		if (Math.round(numberCans) < numberCans){
			double cansNeeded = Math.round(numberCans + 1.00);
			double priceForCans = cansNeeded * canPrice;
			System.out.println("Cans needed = " + cansNeeded);
			System.out.println("Can Price = " + canPrice);
			System.out.println("Price for cans = " + priceForCans);
			assertEquals(3.0, cansNeeded, 0);
			assertEquals(75.00, priceForCans, 0);
		}
		else{
			double cansNeeded = Math.round(numberCans);
			double priceForCans = cansNeeded * canPrice;
			System.out.println("Cans of needed = " + cansNeeded);
			System.out.println("Can Price = " + canPrice);
			System.out.println("Price for cans using = " + priceForCans);
			assertEquals(2.0, cansNeeded, 0);
			assertEquals(50.00, priceForCans, 0);
		}
		
	}
	
	public void testPaintLeftover(double area){		
		double numberCans = (410 / 200);
		if (Math.round(numberCans) < numberCans){
			double cansNeeded = Math.round(numberCans + 1.00);
			double cansLeftover = cansNeeded - numberCans;
			assertEquals(3.0, cansNeeded, 0);
			assertEquals(0.95, cansLeftover, 2);
		}
		else{
			double cansNeeded = Math.round(numberCans);
			double cansLeftover = cansNeeded - numberCans;
			assertEquals(2.0, cansNeeded, 0);
			assertEquals(-0.05, cansLeftover, 2);
		}
	}
}
