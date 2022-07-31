package projectSkyscraper.main;
import java.util.Scanner;
import projectSkyscraper.services.Floors;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of Floors in the building ");
		int floors = sc.nextInt();
		
		Floors obj = new Floors();
		obj.sizeOfFloor(floors);
		obj.orderOfFloors();
		
		sc.close();

	}

}