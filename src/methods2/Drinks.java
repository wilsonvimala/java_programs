package methods2;

public class Drinks {

	public void Hot() {
		System.out.println("\nCoffee\nTea\nMilk");
	}
	
	private void Cool() {
		System.out.println("\n7Up\nCoke\nPepsi");
	}
		
	public static void Soft() {
		System.out.println("\nOrange Juice\nMango Juice\nLemon Juice");
	}
	
	public void Cold() {
		Cool();
	}
}
