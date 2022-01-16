import java.util.Scanner;
public class square_cube {
public static void main(String[] args)
{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("enter the num");
num=sc.nextInt();
if(num%2==0)
{System.out.println("the cube of the num="+num*num*num);
}
else
{System.out.println("the square of num="+num*num);
}
}
}
