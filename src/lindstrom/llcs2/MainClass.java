/*
 * Variable Name   Datatype   Variable description
 * username        string     The users name
 * firstNumber     int        First number user wants to calculate
 * seconNumber     int        Second number the user wants to calculate
 * total           int        Final calculated number
 * */

package lindstrom.llcs2;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		
		{
			String userName; 
			int firstNumber;
			int secondNumber;
			int total;
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Hello, what is your name?");
		    
			userName = input.nextLine();
			
			System.out.println("Hello" + userName);
			
			System.out.println("Please enter your first number.");
			
			firstNumber = input.nextInt();
			
			System.out.println("Your number is " + firstNumber);
			
			System.out.println("Please enter your second number");
			
			secondNumber = input.nextInt();
			
			System.out.println("Your second number is " + secondNumber);
			
			total = firstNumber * secondNumber;
			
			System.out.println("Your total is " + total);
		}

	} //testing

}
