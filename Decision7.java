import java.util.Scanner;
public  class Decision7
{
public static void main(String[]args)
{
char charcter;
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE CHAR=");
charcter=sc.next().charAt(0);
if((charcter>='a'&&charcter<='b'))
System.out.println(charcter+" is alphabet");
else if((charcter>='0'&&charcter<='9'))
System.out.println(charcter+" is digit");
else
System.out.println(charcter+" is special charcter");
}
}