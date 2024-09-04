package Lambdaexpression;

public class Testlambdavalue 
{
	interface FuncInter1
	{
		int operation(int a,int b);
	}
    interface FuncInter2
    {
    	void sayMessage(String message);
    }
    private int operate(int a,int b,FuncInter1 fobj)
    {
    	return fobj.operation(a, b);
    }
	public static void main(String[] args)
	{
		FuncInter1 add=(int x,int y)->x+y;
		FuncInter1 multiply=(int x,int y)->x*y;
		Testlambdavalue tobj=new Testlambdavalue();
		System.out.println("addition is"+tobj.operate(6, 3, multiply));
		System.out.println("multiplication is"+tobj.operate(6,3,add));
		FuncInter2 fobj=message ->System.out.println("hello "+message);
		fobj.sayMessage("systech");

	}

}
