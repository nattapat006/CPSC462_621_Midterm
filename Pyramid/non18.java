public class non18 
{
    public static void main(String den[])
    {
        int non=5;
        for(int i=1;i<=non;i++)
	{
            System.out.print(i);
            for(int j=1;j<=i;j++)
	    {
                System.out.print("*");
            }
            System.out.print(i);
            for(int j=non;j>=i;j--)
	    {
                System.out.print("*");
            }
            System.out.println(non*2-i);
        }
    }
}
