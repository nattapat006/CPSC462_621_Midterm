public class non32
{
    public static void main(String den[])
    {
        int non=3;
        for(int i=1;i<=non*2-1;i++)
	{
            for(int j=1;j<=(non*2-i+2);j++)
	    {
                System.out.print(j);
            }
            for(int j=non;j<=non+i+1;j++)
	    {
                System.out.print("*");
            }
            System.out.println(non-(non-2)+i);
        }
    }
}
