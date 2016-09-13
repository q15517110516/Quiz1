import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the ATT:");
		//ATT = Number of passing attempts
		double ATT = input.nextDouble();
		
		System.out.println("Enter the COMP:");
		//COMP = Number of completions
		double COMP = input.nextDouble();
		
		System.out.println("Enter the YDS:");
		//YDS = Passing yards
		double YDS = input.nextDouble();
		
		System.out.println("Enter the TD:");
		//TD = Touchdown passes
		double TD = input.nextDouble();
		
		System.out.println("Enter the INT:");
		//INT = Interceptions
		double INT = input.nextDouble();
		
		double a = (COMP/ATT-0.3)*5;
		double b = (YDS/ATT-3)*0.25;
		double c = (TD/ATT)*20;
		double d = 2.375-(INT/ATT*25);
		
		double PasserRating = ((a+b+c+d)/6)*100;
		
		
		if (PasserRating>= 2.375){
			System.out.println("The QB rating of this althete is 2.375.");
		}
		else if(PasserRating<0){
			System.out.println("The QB rating of this althete is 0");
		}
		else{
			System.out.printf("The QB rating of this althete is %4.1f", PasserRating);
		}
		
	}
	
}
