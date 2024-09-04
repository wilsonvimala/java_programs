package inheritance;
class Person{
	void work() {
		System.out.println("simply working");
	}
}
class School extends Person{

	@Override
	void work() {
		System.out.println("studying");
	}
	
}

interface Office {
	void work();
}
class Home implements Office{

	@Override
	public
	void work() {
		System.out.println("Watching Tv");
	}
	
}

public class Demo {
	public static void main(String[] args) {
       Home m=new Home();
       m.work();
	}
}
