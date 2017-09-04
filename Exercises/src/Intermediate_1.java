
public class Intermediate_1 {

public static void main(String[] args)
{
	System.out.println(Blackjack(12, 20));
}
public static int Blackjack(int ONE, int TWO)
{
	int Bust = 0;
	if (ONE > 21 && TWO >21)
		{return Bust;}
	else if (ONE > 21)
		{return TWO;}
	else if (TWO > 21)
		{return ONE;}
	else if (ONE > TWO)
		{return ONE;}
	else
		{return TWO;}
}

}