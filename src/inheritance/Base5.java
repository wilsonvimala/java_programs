package inheritance;

public class Base5 
{
   int m=30,s=50,r;
   Base5(int x,int y)
   {
	   m=x;
	   s=y;
   }
   public int add()
   {
	   r=m+s;
	   return r;
   }
   public int sub()
   {
	   r=m-s;
	   return r;
   }
}
