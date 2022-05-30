package question2;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number :");
		
		int a = scanner.nextInt();
		
		Student[] s = new Student[a];
		//System.out.println(s[0]);
		int sum=0;
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter roll :");
			int r = scanner.nextInt();
			//s[i].setRoll(r);
			System.out.println("Enter name :");
			String n = scanner.next();
			//s[i].setName(n);
			System.out.println("Enter address :");
			String ad = scanner.next();
			//s[i].setAddress(ad);
			System.out.println("Enter marks :");
			int m = scanner.nextInt();
			sum=sum+m;
			//s[i].setMarks(m);
			s[i] = new Student(r,n,ad,m);
			System.out.println("Roll is :"+s[i].getRoll());
			System.out.println("Name is :"+s[i].getName());
			System.out.println("Address is :"+s[i].getAddress());
			System.out.println("Marks is :"+s[i].getMarks());
			System.out.println("=============================");
			
		}
		
		int average = sum/a;
		System.out.println(average);

	}

}
