/* WAP to accept the number from user and check the fact */
import java.util.Scanner;
public class fact_loop {
	public static void main(String[] args) {
		int i,num,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println("factorial="+fact);
	}

}
