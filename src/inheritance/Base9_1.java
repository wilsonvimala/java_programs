package inheritance;

public class Base9_1 extends Base9{


	
		int m=30,s=50,r ;
		Base9_1(int x,int y)
		{
			super(x,y);
		}
		public void rect()
		{
			r=m*s;
			System.out.println("rectangle value is");
			
		}
		public void square()
		{
			r=m*m;
			System.out.println("square value is"+r);
		}

	

}
