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
		
			int[] grades = new int[numClasses];
			//ask for each class as depending on the amount stored in numClasses
			for (int i = 0; i != (numClasses); i++) {
				
				  /*
				   * these 2 lines are just for testing, not needed
				  System.out.println("value of I: " + i);
				  System.out.println("value of numclasses: " + numClasses);*/
				  
				  //you don't need to put i in the middle of this, word it however you want
				  System.out.println("What is the " + i + " class you are in?");
				  //make sure the i is in the brackets next to classes, otherwise it wont work or it will over write the same position in the array
				  
				  classes[i] = in.next(); //using this instead of in.nextLine(); causes the runs twice problem
				  
				  
				}
			
			// here is where you would add new code
			
			for (int j = 0; j != (numClasses); j++) {
			//System.out.println("Classes list: " + classes[j] );
			
			System.out.println("What is your grade for this class? " + classes[j]);
			grades[j] = in.nextInt();
			}
			//print list of classes with the grade
			for (int k = 0; k != (numClasses); k++) {
				//System.out.println("Classes list: " + classes[j] );
				
				System.out.println("your grade for " + classes[k] + " is: " + grades[k]);
			
				}
			

		
		}
		else {
			System.out.println("Incorrect");
		}
		
	}	
}


