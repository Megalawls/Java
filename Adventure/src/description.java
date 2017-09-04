
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Random;

public class description {
	ArrayList<String> wordlist = new ArrayList<String>();

	public String describe(int x, int y) {
		Random rando = new Random();
		int picker = rando.nextInt(7);
		wordlist.add(
				"Your tired, and your feet hurt. You take a short break on a resting Rock lobster. sitting on such a small place is trival task when your just text on a screen.");
		wordlist.add(
				"The ground is gray and your back need scratching. You resist the urge and carry on with your treasure hunt. How admirable, go you!");
		wordlist.add(
				"You come across a slug looking at you with distain. You hurry on your way. What a rude slug, you decided to bring salt on your next journey.");
		wordlist.add(
				"A nippy breeze nips across your nipple. How chilly, you reflect on your poor decision of not wearing anything.");
		wordlist.add("You spot a bird in a bush, it sees you. Just what are birds? We just don't know.");
		wordlist.add(
				"You step on a sharp rock. Ouch!. You want to verbally express your pain but you have no mouth the scream with. You endure the pain like tough old boots and carry on.");
		wordlist.add(
				"You notice an almost identical rock you previously passed, you look back and see it there. Yep you definitely moved from where you previously were.");
		wordlist.add(
				"As you pass by a rock, you smell the air though your imaginary nose. Yep you definitely had to manually breath just now.");
		String words = wordlist.get(picker);

		return words;
	}

	public double distance(int x, int x2, int y, int y2) {
		double distanceto = 0;
		distanceto = (double) Math.sqrt((x - x2) * (x - x2) + (y - y2) * (y - y2));
		distanceto = round(distanceto, 2);
		return distanceto;
	}

	// rounding code, nicked from stackoverflow
	public double round(double value, int places) {
		if (places < 0)
			throw new IllegalArgumentException();

		BigDecimal bd = new BigDecimal(value);
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

}
