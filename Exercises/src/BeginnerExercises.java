
//import java.util.Scanner; //Use for final exercise
public class BeginnerExercises {
	
//1 - Output “Hello World!” to the console.
	
/*
 * public static void main(String[] args)
	{
			System.out.println("Hello World");
	}
*/

//2 - Store “Hello World!” in a variable, then output it to the console.
	
/*
public static void main(String[] args)
		{
 String STR = ("Hello World");
		 System.out.println(STR);
		}
*/
	
//3 - Create a method that accepts a string as a parameter, and then outputs that string to the console.
	
/*
public static void main(String[] args)
{
		System.out.println(MyString("This took too damn long to get right :'("));
}
static String MyString(String MyParameter)
{
		return MyParameter;
}
*/

//4 - Modify your method to return a string once called, which you then use to output to the screen.

/*
public static void main(String[] args)
{
	System.out.println(MyString("This took too damn long to get right :'("));
}
static String MyString(String MyParameter)
{
	return MyParameter;
}
*/

//5 - Create a method that accepts two integers as an input, then returns an integer that is a sum of the two integers given.

/*
public static void main(String[] args)
{
	System.out.println(Answer(2,5));
}
public static int Answer(int NumberOne, int NumberTwo)
{
	return NumberOne + NumberTwo;
}
*/
	
//6 - Modify your method from Task 5 to accept another parameter, a Boolean, which if it is true, the method will return a sum of the two numbers, and if it is false it will return the multiplication of the two numbers.

/*
public static void main(String[] args)
{
	System.out.println(Answer(2,5,false));
}
public static int Answer(int NumberOne, int NumberTwo, boolean Sum)
{
	if  (Sum == true)
	{
		return NumberOne + NumberTwo;
	}
	
	else
	{
		return NumberOne * NumberTwo;
	}
	
}
*/

//7 - Modify your method from Task 6 to have another if statement that checks if one of the numbers is 0, if this is true then return the other non-0 number.

/*
public static void main(String[] args)
	{
		System.out.println(Answer(30,8,false));
	}
public static int Answer(int NumberOne, int NumberTwo, boolean Sum)
{
		if (NumberOne == 0)
		{
			System.out.println("NumberOne is 0, returning NumberTwo");
			return NumberTwo;
		}
		else if (NumberTwo == 0)
		{
			System.out.println("NumberTwo is 0, Returning NumberOne");
			return NumberOne;
		}
		else if  (Sum == true)
		{
			return NumberOne + NumberTwo;
		}
		
		else
		{
			return NumberOne * NumberTwo;
		}
		
}
*/

//8 - Create a for loop that will call and output the result of your method from Task 7 10 times, using the current iteration as one of the parameters you pass to it.
	
/*
public static void main(String[] args)
	{
		for (int i = 0; i <10; i++)
		 {
			System.out.println(Answer(10,i,true));
		 }
	}
public static int Answer(int NumberOne, int NumberTwo, boolean Sum)
{
		if (NumberOne == 0)
		{
			System.out.println("NumberOne is 0, returning NumberTwo");
			return NumberTwo;
		}
		else if (NumberTwo == 0)
		{
			System.out.println("NumberTwo is 0, Returning NumberOne");
			return NumberOne;
		}
		else if  (Sum == true)
		{
			return NumberOne + NumberTwo;
		}
		
		else
		{
			return NumberOne * NumberTwo;
		}
}
*/
	
//9 - Create an array that will hold 10 integer values, populate the array with values, then call and output the result of your method from Task 7 with values that are stored in the array.

/*
public static void main(String[] args)
	{
	int[] IntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	for (int i : IntArray)
		 {
			System.out.print(Answer(10,i,false));
		 }
	}
public static int Answer(int NumberOne, int NumberTwo, boolean Sum)
{
		if (NumberOne == 0)
		{
			System.out.println("NumberOne is 0, returning NumberTwo");
			return NumberTwo;
		}
		else if (NumberTwo == 0)
		{
			System.out.println("NumberTwo is 0, Returning NumberOne");
			return NumberOne;
		}
		else if  (Sum == true)
		{
			return NumberOne + NumberTwo;
		}
		
		else
		{
			return NumberOne * NumberTwo;
		}
}
*/

//10 - Using your array that you created in Task 9, create a for loop that iterates through your array, outputting the values contained within it.

/*
public static void main(String[] args)
	{
	int[] IntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	for (int i : IntArray)
		 {
			System.out.println(i);
		 }
	}
*/
	
//11 - Create a for loop that populates an integer array with values, outputting them at each iteration. Then create another loop that iterates through the array, changing the values at each point to equal itself times 10, outputting them at each iteration.

/*
public static void main(String[] args)
	{
	int[] IntArray = new int [10];
	for (int i = 0; i < 10; i++)
	{
		IntArray[i] = i;
		System.out.println("The " + (i+1) + "th number in IntArray is " + i);
	}
	for (int i : IntArray)
	{
		i = i * 10;
		System.out.println("The " + ((i/10)+1) + "th number in IntArray is " + i);
	}
	}
*/

//12 - Modify the previous task to use the Scanner class, taking an integer off of the user and using that integer to determine how large the array is going to be.

/*
public static void main(String[] args)
{
	Scanner S = new Scanner(System.in);
	System.out.println("How big would you like your array to be? Please enter an Integer");
	
	try
	{
		int ArraySize = S.nextInt();
		int[] IntArray = new int [ArraySize];
		System.out.println("Array created with size " + ArraySize);
	}
	catch(Exception E)
	{
		System.out.println("Thats not an Integer.");
	}
}
*/
	
	
}