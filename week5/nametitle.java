import java.util.Scanner;
	//ask user for their age
	//it will check the age if age is above 25 print adult 
	// else age is 19-25 print young adult 
	// if age less than 19 print ten
		
		public class agetitle
{
	public static void main(String arg[])	
	{
		int userage; 
		int youngadult;
		int adult;
		int teen;
		
		
		Scanner scnr=new Scanner(System.in);
        System.out.println("Enter your age:");
        userage = scnr.nextInt(); 
        
        if(userage > 25){
        	 System.out.println("Adult: ");}

        else if (19 < userage && userage < 25 ){
        	System.out.println("young adult");}
        
        
        else {
        	System.out.println("teen");}
		
		
		}
	}
