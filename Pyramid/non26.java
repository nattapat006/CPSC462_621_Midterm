public class non26 
{
    public static void main(String den[])
    {
        int non=5;
        for(int i=1;i<=non;i++)
	{
            for(int j=i;j<=non;j++)
	    {
                System.out.print(i);
            }
            for(int j=1;j<=i;j++)
	    {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
