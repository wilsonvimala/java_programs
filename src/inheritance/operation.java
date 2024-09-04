package inheritance;

public interface operation 
{
   default public void mul(int x,int y)
   {
	   int z;
	   z=x*y;
	   System.out.println("multiplication is "+z);
   }
   default public void div(int x,int y)
   {
	   int z;
	   z=x/y;
	   System.out.println("division is "+z);
   }
}
