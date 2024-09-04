package methods2;

public class CallDrinks {

	public static void main(String[] args) {
		
		// <Class-name>.<Static-Method-Name>()
		Drinks.Soft();
		
		Drinks dr=new Drinks();
		
		// <Object-name>.<Instance-Method-Name>()
		dr.Hot();
		
		dr.Cold();
	}
}
