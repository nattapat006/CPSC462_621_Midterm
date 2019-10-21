public class non27 
{
    public static void main(String den[])
    {
        int non=5;
        for(int i=1;i<=non;i++)
	{
            System.out.print(i);
            for(int j=1;j<=i;j++)
	    {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
	    {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
