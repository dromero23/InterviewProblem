import java.util.Scanner;

public class MIProgram {
	public static void main(String[] args) {
		MIProgram hw = new MIProgram();
		Scanner userInput = new Scanner(System.in);
		String response;
		System.out.println("Welcome! This program takes three "
				+ "integer numbers and determines if there "
				+ "is mathematical operator that makes the first "
				+ "number and the second number equal to the third number");
		do {
			System.out.println("Enter your first number: ");
			int num1= Integer.parseInt(userInput.nextLine());
			System.out.println("Enter your second number: ");
			int num2 = Integer.parseInt(userInput.nextLine());
			System.out.println("Enter your third  number: ");
			int num3 = Integer.parseInt(userInput.nextLine());
			System.out.println("Operator Result: " + hw.mathFunction(num1, num2, num3));
			System.out.println("Do you want to try again? Type yes and enter, any other entries will close the program. ");
			response = userInput.nextLine() ;
			response = response.toLowerCase();
		}while (response.equals("yes"));
		userInput.close(); //close userInput scanner
		System.out.println("Closing program...");
	}
	
	public String mathFunction (int x, int y, int z){
		String s ="";
		//Operator order to check and add to the string (+,-,*,/)
		if((x+y)==z) {
			s=s+"+";
		}
		if((x-y)==z) {
			s=s+"-";
		}
		if((x*y)==z) {			
			s=s+"*";
		}
		if(y!=0 && (x/y)==z) {
			s=s+"/";
		}
		
		//if s is blank return None, otherwise return the math operators
		if (s!="") { 
			return s;
		}
		else {
			return "None";
		}	
	}
}
