/* WAP to accept the number from user and show they are eligible for vote 
 or not */
 import java.util.Scanner;
 
public class age {
	public static void main (String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		age=sc.nextInt();
		if (age>=18)
		{System.out.println("You are eligible for vote");
		}
		else
		{
			System.out.println("You are not eligible for vote");
		}
		}
}
