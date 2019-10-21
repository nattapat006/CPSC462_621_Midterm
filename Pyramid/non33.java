public class non33 
{
    public static void main(String den[])
    {
        int non=4;
            for(int i=1;i<=non;i++)
	    {
                for(int j=i;j<=non+1;j++)
		{
                    System.out.print(" ");
                }
                for(int j=1;j<=i*2-1;j++)				{
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=1;i<non;i++)				    {
                for(int j=1;j<=i+2;j++)					{
                    System.out.print(" ");
                }
                for(int j=i;j<=(non-1)*2-i;j++)
		{
                    System.out.print("*");
                }
                System.out.println();
            }
       
    }
}
