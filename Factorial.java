package day2.Assignment;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=5 , fact =1;
		for (int i = 1; i <= input ; i++) {
			fact = fact *i;
				
		}
		
		System.out.println("Value of "+input +"  Factorial is :"+fact);
	}
	

}
