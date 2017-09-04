import java.util.ArrayList;

class Person {
	String Name;
	int Age;
	String JTitle;

	Person(String N, int A, String JT) {
		Name = N;
		Age = A;
		JTitle = JT;
	}

	void Display() {
		System.out.println(Name + ", " + JTitle + " is " + Age);
	}
}

public class Intermediate_4 {

	public static void main(String[] args) {
		/*
		 * Person Dave = new Person("Dave", 25, "Mechanic");
		 * Person Phil = new Person("Phil", 30, "Accountant");
		 * Person Mason = new Person("Sarah", 21, "Soldier");
		 * Dave.Display();
		 * Phil.Display();
		 * Mason.Display();
		 */

		ArrayList<Person> People = new ArrayList<Person>();
		People.add(new Person("Dave", 25, "Mechanic"));
		People.add(new Person("Phil", 30, "Accountant"));
		People.add(new Person("Sarah", 21, "Soldier"));
		
		System.out.println("Arraylist People has " + People.size() + " People in it;");
		for (int i = 0; i < People.size(); i++) {
		People.get(i).Display();
		}

	}

}
