public class non11 
{
    public static void main(String den[])
    {
        int non=5;
        for(int i=1;i<=non;i++)
	{
            for(int j=non;j>i;j--)
	    {
                System.out.print(" ");
            }
            System.out.print(i);
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}
