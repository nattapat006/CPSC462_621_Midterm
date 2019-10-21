public class mxmn
{
	public static void main(String non[]) 
	{

		int nn[]={10,10,30,40,50,60,70};
		int max=0;
		int min=999;
		int total=0;
		for(int i=0;i<nn.length;i++)
		{
			 if(max<nn[i]) max=nn[i];
 			 if(min>nn[i]) min=nn[i];
			 total+=nn[i];
		}
   	 System.out.println("max="+max);
   	 System.out.println("min="+min);
   	 System.out.println("total="+total);
	}
}