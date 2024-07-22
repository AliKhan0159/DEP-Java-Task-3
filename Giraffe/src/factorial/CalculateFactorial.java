package factorial;
import java.util.Scanner;

public class CalculateFactorial {

	
		public static void main(String[] args) {
		        Scanner keyboardInput = new Scanner(System.in);

		        System.out.print("Please Enter a Number to Calculate its Factorial: ");
		        int num = keyboardInput.nextInt();

		        if (num < 0) {
		            System.out.println("Factorial is Not Defined for Negative Numbers.\n (Try Again and Please Enter a Positive Number.)");
		        } else {
		            long factorial = factorialMethod(num);
		            System.out.println("Factorial of " + num + " is: " + factorial);
		        }

		        keyboardInput.close();
		    }

		   //Method to Calculate the Factorial of a Number.
		   
		public static long factorialMethod(int number) {
		        if (number == 0 || number == 1) {
		            return 1;
		        } else {
		            long result = 1;
		            for (int i = 2; i <= number; i++) {
		                result *= i;
		            }
		            return result;
		        }
		    }
		}
		


	

