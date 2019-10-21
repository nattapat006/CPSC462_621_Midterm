public class non05 
{
    public static void main(String den[])
    {
        int non=4;
        for(int i=1;i<=non;i++)
	{
            for(int j=non-1;j>=i;j--)
 	    {
                System.out.print(" ");
            }
            System.out.print(i);
            for(int j=1;j<i;j++)
	    {
                System.out.print("**");
            }
            System.out.println(i);
        }
        for(int i=1;i<non;i++)
	{
            for(int j=1;j<=i;j++)
	    {
                System.out.print(" ");
            }
            System.out.print(non-i);
            for(int j=non-1;j>i;j--)
	    {
                System.out.print("**");
            }
            System.out.println(non-i);
        }
    }
}