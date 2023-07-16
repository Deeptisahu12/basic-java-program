import java.util.Scanner;
public class rotate
{
public static void main(String[]args)
{
int x,a;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of x");
x=sc.nextInt();
a=x%10;
x=x/10;
System.out.println("rotate number is" +a+x);
}
}

