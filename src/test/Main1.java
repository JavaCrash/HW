package test;
import java.util.Scanner;
import java.util.Arrays;

public class Main1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Define Variables
		String un= "j";
		String pw= "j";
		
		//make system ask for username and accept an input, while storing that value of the input
		System.out.println("Enter Username");
		String Username = in.nextLine();
		
		//same as above 2 lines, just with password
		System.out.println("Enter Password");
		String Password = in.nextLine();
		
		//check if un and pw were correct, if not print incorrent with else statement
		if (Username.equals(un) && Password.equals(pw) ) {
			System.out.println("Correct login");
			
			System.out.println("how many classes are you in?");
			int numClasses = in.nextInt();
			
			//test and make sure the value was properly stored, not required
			System.out.println("value of numClasses: " + numClasses);	
		
			//Array for classes
			String[] classes = new String[numClasses];
		
			
			//ask for each class as depending on the amount stored in numClasses
			for (int i = 0; i != (numClasses); i++) {
				  System.out.println("value of I: " + i);
				  System.out.println("value of numclasses: " + numClasses);
				  System.out.println("What is the " + i + " class you are in?");
				  classes[i] = in.next();
				  //in.nextLine(); //using this instead of in.next(); causes the runs twice problem
				  
				  
				}
			for (int j = 0; j != (numClasses); j++) {
			System.out.println("Classes list: " + classes[j] );
			}

		
		}
		else {
			System.out.println("Incorrect");
		}
		
	}	
}


