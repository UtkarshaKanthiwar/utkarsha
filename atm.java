/* WAP to accept the number from user and check they are balance sheet*/
import java.util.Scanner;
public class atm {

	public static void main(String[] args) {
	
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice:\n1:Withdraw \n2:Check Balance sheet \n3:Pin change \n4:Nothing");
		ch=sc.nextInt();
		switch(ch)
		{case 1:
		    System.out.println("Process of Withdraw:");
		    break;
		    case 2:
		    System.out.println("Process of Balance sheet:");
		    break;
		    case 3:
		    System.out.println("Process of Pin change:");
		    break;
		    case 4:
		    System.out.println("Process of TP:");
		    break;
		    default:
		    System.out.println("please enter your choice");
		    break;
	}
	}
}
