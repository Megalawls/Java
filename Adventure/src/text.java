
import java.util.Random;
import java.util.Scanner;

public class text {

	public static void main(String[] args) {
		int x = 3, y = 3;
		int goalx = 3;
		int goaly = 3;
		int rangel = 0;
		int rangeu = 0;
		int counter = 0;
		boolean again = false;
		boolean check = true;
		Random rand = new Random();
		description words = new description();
		Boolean lose = true;

		Scanner sca = new Scanner(System.in);
		
		do {
			again = false;


			System.out.println("Specify map size:");

			do {
				try {
					rangel = Integer.parseInt(sca.nextLine());
					check = false;
				} catch (Exception e) {
					System.out.println("Thats not a integer, try again.");
				}
			} while (check);
			rangeu = rangel + 1;
			System.out.println("A map size of " + (rangeu - 1) + " by " + -rangel + " has been generated.");

			do {
				goalx = rand.nextInt(rangeu - -rangel) + -rangel;
				goaly = rand.nextInt(rangeu - rangel) + rangel;
			} while (goalx == x && goaly == y);
			int dir = 0;

			System.out.println(
					"After a long night you wake up in a grey place. If you are lost try typing \"look\"\tYou are at x="
							+ x + " y=" + y + "\tGoal location x=" + goalx + " y=" + goaly);

			do {
				counter++;

				System.out.println("Which direction would you like to head towards? " + x + y + goalx + goaly);

				// direction logics goes here

				String i = sca.nextLine();

				if (i.equals("North") || (i.equals("north"))) {
					dir = 1;
				} else if (i.equals("East") || (i.equals("east"))) {
					dir = 2;
				} else if (i.equals("South") || (i.equals("south"))) {
					dir = 3;
				} else if (i.equals("West") || (i.equals("west"))) {
					dir = 4;
				} else if (i.equals("Look") || (i.equals("look"))) {
					dir = 5;
				} else {
					dir = 0;
					System.out.println(
							"Can't do that, enter either: \"North\", \"East\", \"South\", \"West\" or \"Look\"");
				}

				switch (dir) {
				case 1:
					// north
					y++;
					System.out.println(words.describe(x, y));
					break;
				case 2:
					// east
					x++;
					System.out.println(words.describe(x, y));
					break;
				case 3:
					// south
					y--;
					System.out.println(words.describe(x, y));
					break;
				case 4:
					// west
					x--;
					System.out.println(words.describe(x, y));
					break;
				case 5:
					// look

					System.out.println("Your scouter indicates you are " + words.distance(x, goalx, y, goaly)
							+ "m away from booty.");
					break;

				default:
					// watching the grass grow
					System.out.println("Your gut tells you didn't move.");
				}
				if (words.distance(x, goalx, y, goaly) <= 3) {
					System.out.println("You bones are tingling, booty is near!");
				}

				if (goalx == x && goaly == y) {
					lose = false;
				}

			} while (lose);

			System.out.println(
					"On further inspection, thanks to your hypothetical eyes you notice a pocket-sized brass chest.");
			System.out.println(
					"You carefully pry it open with your bear hands and find a small piece of paper that reads:");
			System.out.println("\"It took ye " + counter
					+ " turns to open thee chest, here be treasure if found in a single turn. Arrgh!\"");
			System.out.println("Enter any key to play again...");
			String againcheck =sca.nextLine();
			again=true;

		} while (again);
		sca.close();
	}
}
