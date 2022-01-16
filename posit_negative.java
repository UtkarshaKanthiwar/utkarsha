/* WAP to accept a no from user and check it is positive or negative */
import java.util.Scanner;
public class posit_negative {
public static void main(String[] args) {
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no");
	num=sc.nextInt();
	if (num==0)
	{
		System.out.println("Enter the no");
	}
	else if (num>0)
	{
		System.out.println("The no is positive");
	}
	else
	{
		System.out.println("The no is negative");
	}
}
}
