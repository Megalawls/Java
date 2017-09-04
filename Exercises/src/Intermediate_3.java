
public class Intermediate_3 {

public static void main(String[] args)
{
	System.out.println(IsItTooHotM8(91, false));
}
public static boolean IsItTooHotM8(int temperature, boolean isSummer)
{
	if (isSummer == true && temperature >= 60 && temperature <= 100){return true;}
	else if (isSummer == false && temperature >= 60 && temperature <= 90){return true;}
	else {return false;}
}
}