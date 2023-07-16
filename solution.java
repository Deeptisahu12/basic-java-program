public class solution
{
public static void waveprint(int mat[][])
{
int rows=mat.lenght;
int cols=mat[0].length;
for (int j=0;j<cols;j++)
{
if(j%2==0)
{
for(int i=0;i<rows;i++)
{
System.out.print(mat[i][j]+" ");
}
}
else
{
for(int i=rows-1;i>=0;i--)
{
System.out.print(mat[i][j]+" ");
}
if(rows==0)
{
return;
}
}
}
System.out.println();
}
}