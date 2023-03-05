package mealservicepublisher;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;


public class ServicePublishImpl implements ServicePublish{
	
	Scanner in = new Scanner(System.in);
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
	String name;
	String number;
	String mealType, mealTypeName;
	Integer noOfMeals = 0;
	Double cost, totalCost;
	String checkInDate;
	Integer mealID;

    
	@Override
	public String publishService() {
		basicData();
		
		System.out.println("Confirm the Meal Reservation? Y/N");
		String accept  = in.next();
		
		if(accept.equals("N") || accept.equals("n")) {
			System.out.println(" ");
			System.out.println("Thank you & Have a safe flight!...");
			System.out.println(" ");
			basicData();
		}
		else if(accept.equals("Y") || accept.equals("y")) {
			System.out.println(" ");
			Random rand = new Random();
			mealID = rand.nextInt(99999);
			System.out.println("Your Meal Reservation has been confirmed. Your Meal ID is " + String.format("%05d", mealID) +  " Thank you!...");
			System.out.println(" ");
			recieptPrinter();
		}
		return "+++++++++++++++++++++++++++++++++++++";
       
	}
	
	public void basicData() {
		
		try
	    {	
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(" ");
		System.out.println("=====================================");
		System.out.println(" ");
		System.out.println("        Welcome! Our Meal Reservation service will help you have a pleasant meal during the flight...");
		System.out.println(" ");
		System.out.println("=====================================");
		
		System.out.println("Please enter your name :");
		name = input.readLine();
		System.out.println("Please enter your flight number : ");
		number = input.readLine();
		System.out.println(" ");
		System.out.println("---------------Hello " + name + "! Check out our delicious meal options-------------------------");
		System.out.println();
		System.out.println("--A)-- Fruit Platter Meal	8,000 LKR per serving");
		System.out.println(" 	Included: 		Seasonal fresh fruit\n ");
		System.out.println("--B)-- Low Protein Meal		16,000 LKR per serving");
		System.out.println("	Included: 		These meals may contain fresh fruit and vegetables, vegetable fats and seasoning, and a measured amount of eggs and meat.\n ");
		System.out.println("--C)-- Oriental Meal		32,000 LKR per serving");
		System.out.println("	Included:  		The main course features an “Oriental style” accompanied by beef, pork, chicken, duck, or fish. ");
		System.out.println(" ");
		System.out.println("Please select the meal option you prefer [ A | B | C ]");
		System.out.println("A) Fruit Platter Meal \t B) Low Protein Meal  \t C) Oriental Meal  ");
		mealType = input.readLine();
		
		if(mealType.equalsIgnoreCase("A")) {
			
			cost = 8000.00;
			mealTypeName = "Fruit Platter Meal";
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("        " +mealTypeName + " Meal Details   ");
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("* Included: 	Seasonal fresh fruit");
			System.out.println("* Meal Price: 	8,000 LKR");
			System.out.println(" ");
			System.out.println("=====================================");
		
			
			System.out.println("Please enter your check in date (DD/MM/YY) : ");
			checkInDate = input.readLine();
			
			System.out.println("Please enter the number of meals you want reserved : ");
			noOfMeals = in.nextInt();
			
			totalCost = cost * noOfMeals;
			
			System.out.println("");
			
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("        Meal Receipt    ");
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("Name : 			" + name );
			System.out.println("Flight No : 		" + number );
			System.out.println("Meal Type : 		" + mealTypeName);
			System.out.println("Check in Date : 	" + checkInDate );
			System.out.println("No of Meals : 	" + noOfMeals );
			System.out.println("Meal Cost: 		8,000 LKR");
			System.out.println("Total Cost: 		" + totalCost+"0 LKR");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("");
			
		} else if(mealType.equalsIgnoreCase("B") ) {
			
			cost = 16000.00;
			
			mealTypeName = "Low Protein Meal";
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("        " +mealTypeName + " Meal Details   ");
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("* Included: 	These meals may contain fresh fruit and vegetables, vegetable fats and seasoning, and a measured amount of eggs and meat.");
			System.out.println("* Meal Price: 	16,000 LKR");
			System.out.println(" ");
			System.out.println("=====================================");
		
			
			System.out.println("Please enter your check in date (DD/MM/YY) : ");
			checkInDate = input.readLine();
			
			System.out.println("Please enter the number of meals you want reserved : ");
			noOfMeals = in.nextInt();
			
			totalCost = cost * noOfMeals;
			
			System.out.println("");
			
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("        Meal Receipt    ");
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("Name : 			" + name );
			System.out.println("Flight No : 		" + number );
			System.out.println("Meal Type : 		" + mealTypeName);
			System.out.println("Check in Date : 	" + checkInDate );
			System.out.println("No of Meals : 	" + noOfMeals );
			System.out.println("Meal Cost: 		16,000 LKR");
			System.out.println("Total Cost: 		" + totalCost+"0 LKR");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("");
			
		} else if(mealType.equalsIgnoreCase("C") ) {
			
			cost = 32000.00;
			
			mealTypeName = "Oriental Meal";
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("        " +mealTypeName + " Room Details   ");
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("* Included: 	The main course features an “Oriental style” accompanied by beef, pork, chicken, duck, or fish.");
			System.out.println("* Meal Price: 	32,000 LKR");
			System.out.println(" ");
			System.out.println("=====================================");
		
			
			System.out.println("Please enter your check in date (DD/MM/YY) : ");
			checkInDate = input.readLine();
			
			System.out.println("Please enter the number of meals you want reserved : ");
			noOfMeals = in.nextInt();
			
			totalCost = cost * noOfMeals;
			
			System.out.println("");
			
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("        Meal Receipt    ");
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("Name : 			" + name );
			System.out.println("Flight No : 		" + number );
			System.out.println("Meal Type : 		" + mealTypeName);
			System.out.println("Check in Date : 	" + checkInDate );
			System.out.println("No of Meals : 	" + noOfMeals );
			System.out.println("Meal Cost: 		32,000 LKR");
			System.out.println("Total Cost: 		" + totalCost+"0 LKR");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("");
			
			
		} 
		return;
      } catch (Exception ex) { }
	}
	
	public void recieptPrinter() {
		try {
			PrintStream pw = new PrintStream(new File("D:\\Education\\SLIIT\\Year 4\\IT 4020 - Modern Topics in IT\\Recipts\\mealReceipt.txt"));
			if(mealType.equalsIgnoreCase("A")) {				
				pw.println();
				pw.println("=====================================");
				pw.println("        Meal Receipt   ");
				pw.println("=====================================");
				pw.println(" ");
				pw.println("Name : 			" + name );
				pw.println("Flight No : 		" + number );
				pw.println("Meal Type : 		" + mealTypeName);
				pw.println("Check in Date : 	" + checkInDate );
				pw.println("No of Meals : 	" + noOfMeals );
				pw.println("Meal Cost: 		8,000 LKR");
				pw.println("Total Cost: 		" + totalCost+"0 LKR");
				pw.println(" ");
				pw.println("=====================================");
				System.out.println("The Receipt has been printed");
				
			} 
			else if(mealType.equalsIgnoreCase("B")) {
				pw.println(" ");
				pw.println("=====================================");
				pw.println("        Meal Receipt    ");
				pw.println("=====================================");
				pw.println(" ");
				pw.println("Name : 			" + name );
				pw.println("Flight No : 		" + number );
				pw.println("Meal Type : 		" + mealTypeName);
				pw.println("Check in Date : 	" + checkInDate );
				pw.println("No of Meals : 	" + noOfMeals );
				pw.println("Meal Cost: 		16,000 LKR");
				pw.println("Total Cost: 		" + totalCost+"0 LKR");
				pw.println(" ");
				pw.println("=====================================");
				pw.println("");
				System.out.println("The Receipt has been printed");
			} 
			else if(mealType.equalsIgnoreCase("C")) {
				pw.println(" ");
				pw.println("=====================================");
				pw.println("        Meal Receipt    ");
				pw.println("=====================================");
				pw.println(" ");
				pw.println("Name : 			" + name );
				pw.println("Flight No : 		" + number );
				pw.println("Meal Type : 		" + mealTypeName);
				pw.println("Check in Date : 	" + checkInDate );
				pw.println("No of Meals : 	" + noOfMeals );
				pw.println("Meal Cost: 		32,000 LKR");
				pw.println("Total Cost: 		" + totalCost+"0 LKR");
				pw.println(" ");
				pw.println("=====================================");
				pw.println("");
				System.out.println("The Receipt has been printed");
			} 
		
			
			else {
				pw.println("");
			}	
			pw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
