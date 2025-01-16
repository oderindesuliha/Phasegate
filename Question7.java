public class Question7{
	public static void main(String[] args){
	int number = 24 ;
	System.out.print("The factors of " + number + " are " + factorOf(number));
	}
	public static int factorOf(int number) { 
     	 int count = 0;
        	for (int counter = 1; counter <= number; counter++) {
           	if (number % counter == 0) {
                counter ++;
            }
  }
        	return count;
}
}