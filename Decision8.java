import java.util.Scanner;
public  class Decision8
{
public static void main(String[]args)
{
int digit;
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE DIGIT=");
digit=sc.nextInt();
if(digit>99&&digit<1000)
System.out.println(digit+"three digit number");
else
System.out.println(digit+"is not three digit number");
}
}