import java.util.Scanner;
public  class Decision6
{
public static void main(String[]args)
{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE NUMBER=");
num=sc.nextInt();
if(num>0)
System.out.println("number is positive");
else if(num<0)
System.out.println("number is negative");
else
System.out.println("number is zero");
}
}


