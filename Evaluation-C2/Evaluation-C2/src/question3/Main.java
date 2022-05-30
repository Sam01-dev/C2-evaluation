package question3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of passengers :");
		int p = scanner.nextInt();
		
		System.out.println("Enter Number of Kms");
		int k = scanner.nextInt();
		
		OLA myOla = new OLA();
		Car myCar = myOla.bookCar(p, k);
		int res = myOla.calculateBill(myCar);
		
		System.out.println("The total fare amount is :"+res);

	}

}
