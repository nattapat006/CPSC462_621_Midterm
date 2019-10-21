public class non10 
{
    public static void main(String den[])
    {
        int non=5;
        for(int i=1;i<=non;i++)
	{
            for(int j=i;j<non;j++)
	    {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
	    {
                System.out.print(j);
            }
            System.out.print(non-i+1);
            for(int j=i;j>=1;j--)
	    {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
