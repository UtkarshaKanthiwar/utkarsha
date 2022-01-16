/* WAP to accept the number from user and check area of circle */
import java.util.Scanner;

public class circle {

	public static void main(String[] args) {
		int r;
		double pi=3.14,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the vailue of r");
		r=sc.nextInt();
		c=pi*r*r;
		System.out.println("area of circle is="+c);

	}

}
