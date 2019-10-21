public class non03
{
    public static void main(String den[])
    {
        int non=5;
        for(int i=1;i<non;i++)
	{
            System.out.print(i+""+(i+4));
            for(int j=1;j<=i+4;j++)
	    {
                System.out.print("*");
            }
            System.out.println("");
        }       
    }
}