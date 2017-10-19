import java.util.ArrayList;

public class Fizzbuzz {

    public static ArrayList fizzbuzz(int end) {
        ArrayList result = new ArrayList<String>();
        for(int i = 1; i <= end; i++) {
            if (Integer.toString(i).contains("3")) {
                result.add("Lucky");
            }
            else if (i % 15 == 0){
                result.add("Fizzbuzz");
            }
            else if(i % 3 == 0) {
                result.add("Fizz");
            }
            else if(i % 5 == 0) {
                result.add("Buzz");
            }
            else {
                result.add(""+i);
            }
        }
        return result;
    }

    public static String count(ArrayList buzzfizz) {
        int buzz = 0;
        int fizz = 0;
        int fb = 0;
        int lucky = 0;
        int integer = 0;

        for(int i = 0; i < buzzfizz.size(); i++) {
            if(buzzfizz.get(i).equals("Fizzbuzz")) {
                fb ++;
            }
            else if(buzzfizz.get(i).equals("Fizz")) {
                fizz ++;
            }
            else if(buzzfizz.get(i).equals("Buzz")) {
                buzz ++;
            }
            else if(buzzfizz.get(i).equals("Lucky")) {
                lucky ++;
            }
            else {
                integer ++;
            }
        }

        return ("FizzBuzz: " + fb + " Buzz: " + buzz + " Fizz: " + fizz + " Lucky: " + lucky + " Int: " + integer);
    }

    public static void main(String[] args) {
        ArrayList result = fizzbuzz(50);

        //result.forEach(number -> System.out.print(number + " "));
        System.out.println(count(result));
    }
}
