public class Continue
{
public static void main(String[]args)
{
 for(int i=1;i<=5;i++)
{
for(int j=1;j<=6;j++)
{
if(j>i)
continue;
System.out.print("*");
}
System.out.println();
}
}
}