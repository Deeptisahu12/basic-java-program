import java.util.Scanner;
public  class Decision9
{
public static void main(String[]args)
{
int digit;
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE DIGIT=");
digit=sc.nextInt();
if(digit%5==0)
System.out.println(digit+ "is divisible by 5");
if(digit%7==0)
System.out.println(digit+ "is divisible by 7");
else
System.out.println(digit+ "is not divisible by 5 and 7");
}
}