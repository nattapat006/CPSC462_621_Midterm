public class non21 
{
    public static void main(String den[])
    {
        int non=5;
        for(int i=1;i<=non;i++)
	{
            for(int j=0;j<=((non*2)-(i+3));j++)
 	    {
                System.out.print("*");
            }
            System.out.print(i);
            for(int j=i;j>=1;j--)
	    {
                System.out.print("*");
            }
            System.out.println((non*2)-(i+2));
        }
    }
}
