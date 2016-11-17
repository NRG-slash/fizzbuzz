package fizzbuzz;

/**
 * 
 */

/**
 *
 * Name: Laturski, Garrett William
 * Teacher: Mr.Hardman
 * Assignment #3
 * Date Last Modified: 
 *
 */

public class fizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 100; i++){
			
			if(i%3 == 0 && i%5 == 0){
				
				System.out.println("FizzBuzz");
			}
			else if(i%3 == 0){
				
				System.out.println("Fizz");
			}
		
			else if(i%5 == 0){
				
				System.out.println("Buzz");
			}
		
			else{
				
				System.out.println(i);
			}
		}
		
	}

}
