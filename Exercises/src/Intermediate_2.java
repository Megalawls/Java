
public class Intermediate_2 {

public static void main(String[] args)
{
	System.out.println(Sum(1,2,50));
}
public static int Sum(int A, int B, int C)
{	if (A == B && B == C) {return 0;}
	else if (A == B) {return C;}
	else if (B == C) {return A;}
	else if (C == A) {return B;}
	else {return A+B+C;}}
}
