import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class Human {
	String Name;
	int Age;
	String JTitle;

	Human(String N, int A, String JT) {
		Name = N;
		Age = A;
		JTitle = JT;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	void setAge(int age) {
		Age = age;
	}

	public String getJTitle() {
		return JTitle;
	}

	public void setJTitle(String jTitle) {
		JTitle = jTitle;
	}
}

public class Intermediate_7 {

	public static void main(String[] args) {
		try {
			ArrayWriter("");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			ReaderToArray("");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static void ArrayWriter(String Dir) throws IOException {
		ArrayList<Human> Humans = new ArrayList<Human>();
		Humans.add(new Human("Dave", 25, "Mechanic"));
		Humans.add(new Human("Phil", 30, "Accountant"));
		Humans.add(new Human("Sarah", 21, "Soldier"));
		Humans.add(new Human("Geoff", 23, "Miner"));
		Humans.add(new Human("Recette", 14, "Shop Owner"));

		for (Human i : Humans) {
			Dir = "C:\\Users\\Administrator\\Desktop\\WriterOutput\\" + Humans.indexOf(i) + ".txt";
			BufferedWriter arrayOuti = new BufferedWriter(new FileWriter(Dir));
			arrayOuti.write(i.Name + "-" + i.JTitle + "-" + i.Age);
			System.out.println(i.Name + " written to file");
			if (arrayOuti != null)
				arrayOuti.close();
		}
	}

	static void ReaderToArray(String Dir) throws IOException {
ArrayList<Human> ReadHumans = new ArrayList<Human>();
		for(int i = 0; i<5;i++){
		Dir = ("C:\\Users\\Administrator\\Desktop\\WriterOutput\\" + i + ".txt");
		BufferedReader arrayIni = new BufferedReader(new FileReader(Dir));
		String string = arrayIni.readLine();
		String[] parts = string.split("-");
		String Name = parts[0];
		String Jtitle = parts[1];
		int Age = Integer.parseInt(parts[2]);
		ReadHumans.add(new Human(Name, Age, Jtitle));
		arrayIni.close();
		}
		for (Human i : ReadHumans){
		System.out.println(ReadHumans.indexOf(i) + " - " + i.Name + ", " + i.JTitle + ", " + i.Age);	
		}
		
	}

}
