//Jonathan Richardson
//The code takes the user's speed and distance input and calculates the time the trip will take.
//The calculation is done by dividing the distance measurement by the speed measurement.
import java.util.Scanner;

public class Chpt2_Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//The program is taking the user's average speed input and storing it as an integer.
		System.out.print("Enter the average miles per hour (mph) for the car (this must be an integer):");
		int avgmph = input.nextInt();
		
		//The program is taking the user's trip distance and storing it as a double.
		System.out.print("Enter the distance in miles the trip is (this must be a double):");
		double distance = input.nextDouble();
		
		//The program is calculating the trip time by dividing the distance by the average speed and storing it as a double.
		double hours = distance / avgmph / 1;
		
		//The program outputs the average speed by printing the calculated double.
		System.out.print("The trip will take the following number of hours:" + (int)(hours));
	
	}

}
