import java.util.Scanner;
public class SWAP
{
public static void main(String[]args)
{
int x,y;//where x and y will be swap
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of x and y");
x=sc.nextInt();
y=sc.nextInt();
System.out.println("before swapping number="+x+" "+y);
/*swapping*/
x=x+y;
y=x-y;
x=x-y;
System.out.println("After swapping="+x+" "+y);
}
}