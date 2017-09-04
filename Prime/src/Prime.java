public class Prime {

	public static void main(String args[]) {
		
		int count = 0;
		int limit = 2000;
		for(int i = 2; i <= limit; i++){
			{
			  boolean Prime = isPrime(i);
			  if (Prime == true){
				  count++;
			  }
			}
			
		}
		System.out.println(count);
	}

	public static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		System.out.println(number);
		return true;
	}
}
