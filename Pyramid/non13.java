public class non13
{
    public static void main(String den[])
    {
        int non=5;
        for(int i=1;i<=non;i++)
	{
            for(int j=1;j<i*2-1;j++)
	    {
                System.out.print(" ");
            }
            for(int j=non*2-(i*2-1);j>=1;j--)
	    {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
