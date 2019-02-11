Week2 
read me





//Author: Yousuf Babsail

//2/7/19
//CMP167 11-12:45
//this program calculates the average of any 3 numbers as given by the user. 




package cmp167;

import java.util.Scanner;
public class avg {
		public static void main  (String [] args) {
		      Scanner scnr = new Scanner(System.in);

		      double num1;
		      double num2;
		      double num3;
		      double sum;
		      double avg;
		   
		      System.out.print("Enter num1 value: ");
		      num1 = scnr.nextDouble();

		      System.out.print("Enter num2 value: ");
		      num2 = scnr.nextDouble();
		      
		      System.out.print("Enter num3 value: ");
		      num3= scnr.nextDouble();
		      sum= num1 + num2 + num3;
		      avg= sum/3;
		      
		   
		   
		      System.out.print(avg);
		   }

}
