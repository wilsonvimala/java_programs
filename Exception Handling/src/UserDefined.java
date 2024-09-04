
public class UserDefined extends Exception 
{
	private static int Pid[]= {1,2,3};
    private static String Pname[]=
    	{" mobile","laptop","computer"};
    			
    private static double Price[]=
    	
    			
    			{20000.00,32000.0,25700.0};
    UserDefined()
    {
    	
    }
    UserDefined(String str)
    {
    	super();
    }
    	
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("PNO"+"\t"+" Product Name"+"\t"+"price");
		
		for(int i=0;i<3;i++) 
		{
			System.out.println(Pid[i]+"\t"+Pid[i]+"\t\t"+Price[i]);
			if(Price[i]<4000)
			{
				UserDefined k= new UserDefined("price below 4000");
				throw k;
			}
		}
		

	}
		catch (UserDefined e)
		{
			e.printStackTrace();
		}
	}
}
