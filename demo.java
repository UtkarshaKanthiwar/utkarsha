/* WAP to accept the number from user and check the addition */
import java.util.Scanner;
public class demo {
	
	
		public static void main(String[] args) {
		    int num1,num2,sum;
		    Scanner sc=new Scanner(System.in);
			System.out.println("Enter the two number");
			num1=sc.nextInt();
			num2=sc.nextInt();
			sum=num1+num2;
			System.out.println("The number add is "+sum);
		}
	}
