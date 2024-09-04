package functional;

public class Demo {
	public static void main(String[] args) {
		//lambda function
		//annoymous method //nameless function
		
		//annoymous inner class
    Addition a=new Addition() {
		
		@Override
		public void add(int x, int y) {
			System.out.println(x+y);
			
		}
	};
	a.add(10, 30);
	}

}
