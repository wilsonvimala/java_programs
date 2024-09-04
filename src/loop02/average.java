package loop02;
import java.util.*;

public class average
{

	public static void main(String[] args) 
	{
		int a,xsum=0,ysum=0,xcount=0,ycount=0;
		float xavg,yavg;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
		a=s.nextInt();
		while(a!=1000) 
		{
			if(a>0)
			{
				xsum=xsum+a;
				xcount++;
		}
			else
			{
				ysum=ysum-a;
				ycount++;
			}
			System.out.print("enter the value");
			a=s.nextInt();
		
		}
		xavg=xsum/xcount;
		yavg=ysum/ycount;
		System.out.println("positive avg is "+xavg);
		System.out.println("negative avg is "+-(yavg));

	}

}
