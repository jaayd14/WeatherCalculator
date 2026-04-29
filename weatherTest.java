package avgRainFall;
import java.util.Scanner;
public class weatherTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int userYears;	// number of years
		int months = 12; //number of months 
		double avgRainFall; //rainfall average for each month
		double grandTotalRainFall = 0; //total rainfall 
		int totalMonths; //total months user input in loop
		System.out.println("Welcome to Jay's Weather Calculator!");
		
		
		System.out.println("Input the number of years:");  //getting users input for the number of years they want to calculate
			userYears = scnr.nextInt(); //storing users input
			
		
		while(userYears < 1) {
			System.out.println("Error. Please enter a year 1 or more"); //making sure user doesn't enter negative numbers
				userYears = scnr.nextInt(); //storing users input
		}
		
		System.out.println("Input the rainfall for each month, in inches:"); //telling the user to input the rainfall in inches
			
		int y;
		int i;

		for (y = 1; y <= userYears; ++y) { //making sure the years loop once
			for (i = 1; i <= months; ++i) { //months loop twelve times
				System.out.println("Enter rainfall for " + "year " + y + " " + "month " + i + ":" ); //output for loops above
					avgRainFall = scnr.nextDouble(); //storing output for the loops above
				
				grandTotalRainFall = grandTotalRainFall + avgRainFall; //storing total rainfall 
				
				
				
				
				
			}
		}
			
		System.out.println("The Total rainfall is:" + " " + grandTotalRainFall); //storing grandTotal output
		totalMonths = userYears * 12; //storing totalMonths
		System.out.println("The average montly rainfall is:" + " " + grandTotalRainFall / totalMonths); //outputting the average monthly rainfall by diving total rainfall by the number of months
		scnr.close(); 
	}
}
		

	
	


