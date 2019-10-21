public class non15 
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
            for(int j=1;j<=(i*2-1);j++)
	    {
                System.out.print(" ");
            }
            for(int j=i;j<=non;j++)
	    {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
