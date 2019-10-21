public class non16 
{
    public static void main(String den[])
    {
        int non=5;
        for(int i=1;i<=non;i++)
	{
            for(int j=i;j>=1;j--)
	    {
                System.out.print(j);
            }
            for(int j =i;j<non*2-i;j++)
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
