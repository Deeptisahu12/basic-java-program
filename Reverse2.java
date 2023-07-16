import java.util.Scanner;
public class Reverse2
{
public static void main(String[]args)
{
int num,reverse;
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE  NUMBER:-");
num=sc.nextInt();
temp=num%10;
System.out.print(temp);
temp=num/10;
temp=temp%10;
System.out.print(temp);
temp=num/10;
temp=temp/10;
System.out.print(temp);
System.out.print("AFTER REVERSE RESULT IS:-");
}
}
