package Lambdaexpression;

public class Demo {
	public static void main(String[] args) {
		Addition a = new Addition() {

			@Override
			public void add() {
				System.out.println("hi");

			}

		};
		a.add();
		Addition a1=()->System.out.println("hi");
		a1.add();
	}

}
