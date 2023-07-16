import java.util.Scanner;
public  class Decision4
{
public static void main(String[]args)
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE FIRST NUMBER=");
a=sc.nextInt();
System.out.println("ENTER SECOND NUMBER=");
b=sc.nextInt();
System.out.println("ENTER SECOND NUMBER=");
c=sc.nextInt();
if(a>b&&a>c)
System.out.println(greater number is a);
if(b>c&&b>c)
System.out.println(greater number is b);
else
System.out.println(greater number is c);
}
}



