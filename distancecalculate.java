import java.util.Scanner;
public class distancecalculate
{
public static void main(String[]args)
{
double D,V,T;
Scanner sc=new Scanner(System.in);
System.out.println("enter V in mile per hour");
V=sc.nextDouble();
System.out.println("enter D in mile");
D=sc.nextDouble();
T=D/V;
System.out.println(T);
}
}
