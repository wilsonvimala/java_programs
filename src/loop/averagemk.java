package loop;
import java.util.Scanner;
public class averagemk 
{

	public static void main(String[] args)
	{
		int n,t,e,m,s,ss,sum;
		float avg;
		Scanner k=new Scanner(System.in);
		System.out.print("enter n number");
		n=k.nextInt();
		for (int i=1;i<=n;i++);
		{
			System.out.println("enter tamil:");
			t=k.nextInt();
			System.out.println("enter english:");
			e=k.nextInt();
			System.out.println("enter math:");
			m=k.nextInt();
			System.out.println("enter science:");
			s=k.nextInt();
			System.out.println("enter social:");
			ss=k.nextInt();
		    sum=t+e+m+s+ss;
		    avg=sum/n;
		    if(avg>70)
		    {
		    	System.out.println("first grade");
		    }	
		    	else if((avg>40)&&(avg<70))
		    	{
		    		System.out.println("second grade");
		    	}
		    	else
		    	{
		    		System.out.println("fail");
		    		
		    	}
		    	
		    }
		}    		
		
		

	}


		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		




