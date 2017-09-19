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

	static Scanner input = new Scanner(System.in);
	static boolean isProgramRunning;
	
	public static void main(String[] args) 
	{
		
		
		{
			String userName; 
			
			int userChoice;
			
			
			
			
			System.out.println("Hello, what is your name?");
			
			isProgramRunning = true;
			
			while (isProgramRunning == true) 
			{
				userName = input.nextLine();
				
				System.out.println("Hello"+ userName + ". What would you like to do? (Enter the number of your choice.)");
				System.out.println("(1) Add, (2) Subtract, (3) Divide, (4) Multiply, (5) Quit");
				
				userChoice = input.nextInt();
			    
				calculate(userChoice);
				
				if (userChoice == 5) 
				{
					isProgramRunning = false;
				}
				else 
				{
					calculate(userChoice);
				}
					
			}
			
			System.out.println("Goodbye");
		}
	}
					
					
	public static void calculate(int userChoice) 
	{
		int firstNumber;
		int secondNumber;
		int total = 0;
						
		System.out.println("Enter your first number");
		firstNumber = input.nextInt();
		System.out.println("Enter your second number");
		secondNumber = input.nextInt();
						
			switch (userChoice)
			{
				case 1:
					//Add
					total = firstNumber + secondNumber;
					break;
				case 2:
					//Subtract
					total = firstNumber - secondNumber;
					break;
				case 3:
					//Divide
					total = firstNumber / secondNumber;
					break;
				case 4:
					//Multiply
					total = firstNumber * secondNumber;
					break;
						
				default:
					System.out.println("Invalid selection");
					break;
								
				}
			
			System.out.println("Your total is: " + total);		
		}	
	
}
			
			
			
			

	



