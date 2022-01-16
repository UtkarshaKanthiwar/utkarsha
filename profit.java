import java.util.Scanner;
public class profit {
	
		public static void main(String[]args) {
			int sp,cp;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the cost price");
			cp=sc.nextInt();
			System.out.println("Enter the selling price");
			sp=sc.nextInt();
			if(sp>cp)
			{System.out.println("profit="+(sp-cp));
		}
			else
			{System.out.println("loss="+(cp-sp));
			}
			}
}
