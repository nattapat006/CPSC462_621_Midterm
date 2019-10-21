public class non28 
{
    public static void main(String den[])
    {
        int non=5;
        for(int i=1;i<=non;i++)
	{
            for(int j=non;j>=i;j--)
	    {
                System.out.print(j);
            }
            for(int j=1;j<=i*2-1;j++)
	    {
                System.out.print("*");
            }
            for(int j=i;j<=non;j++)
	    {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
