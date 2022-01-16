import java.util.Scanner;
public class inh {

	public static void main(String[] args) {
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first value");
		x=sc.nextInt();
		System.out.print("Enter the second value");
		y=sc.nextInt();
		System.out.print("Enter the third value");
		z=sc.nextInt();
		if(x>y && x>z)
		{System.out.println("largest number is:"+x);
		}
		else if(y>z)
		{System.out.println("largest number is:"+y);
			
	}
		else
		{System.out.println("largest number is:"+z);
}
}
}