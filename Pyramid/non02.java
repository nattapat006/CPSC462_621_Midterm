public class non02 
{
    public static void main(String den[])
    {
        int non=4;
        for(int i=1;i<=non;i++)
	{
            for(int j=i;j<=i+2;j++)
	    {
                System.out.print(j);
            } 
            for(int j=1;j<=i+1;j++)
	    {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}