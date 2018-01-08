public class Array
{
public static void main(Strings[] args)
{
System.out.println("Enter Elements");
int m=sc.nextInt();
System.out.println("Enter Elements");
int n=sc.nextInt();


int a[][] = integer2D(m,n);
display(a);
}

public staic int[][] integer2D(int m,int n)
{
Scanner in = new Scanner(System.in);
int[][] a =new int[][];
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.println("Enter Elements");
a[i][j]=in.nextInt();
}
}
return a;
}
public static void display(int a[][])
{
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.println(a[i][j]);
}
System.out.println("");
}
}
}
