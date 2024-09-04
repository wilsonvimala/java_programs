import java.util.*;
public class stringarray
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n value ");
		int n=s.nextInt();
		int b[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("enter the value");
				b[i][j]=s.nextInt();
			}
		}
        System.out.print(Arrays.deepToString(b));	

	}

}
