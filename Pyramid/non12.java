public class non12 
{
    public static void main(String den[])
    {
        int non=5;
        for(int i=1;i<=non;i++)
	{
            for(int j=1;j<i;j++)
	    {
                System.out.print(" ");
            }
            for(int j=i;j<=(non*2-i);j++)
	    {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
