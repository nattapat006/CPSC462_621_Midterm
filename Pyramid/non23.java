public class non23 
{
    public static void main(String den[])
    {
        int non=5;
        for(int i=1;i<=non;i++)
	{
            System.out.print(i);
            for(int j=i;j<=non+1;j++)
	    {
                System.out.print("*");
            }
            for(int j=1;j<i;j++)
	    {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}
