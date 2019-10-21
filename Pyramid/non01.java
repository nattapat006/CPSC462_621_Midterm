public class non01 
{
    public static void main(String den[])
    {
        int non=4;
        for(int i=1;i<=non;i++)
	{
            for(int j=2;j<=i;j++)
	    {
                System.out.print(" ");
            }
            
            System.out.print(i+""+i);
            
            for(int j=non;j>=(i+1);j--)
	    {
                System.out.print("**");          
            }
            System.out.println(i+""+i);
        }
    }
}