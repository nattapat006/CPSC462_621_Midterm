public class non06
{
    public static void main(String den[])
    {
        int non=7;
        for(int i=non;i>=1;i--)
        { 
            for(int j=non;j>i;j--)
	    {
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++)
	    {
                System.out.print((j%2));
            }
            System.out.println();
        }
    }
}