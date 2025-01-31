package Day2;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apple a= new Apple("Kahmiri");
		Fruit f= new Apple("Suneheri");
		Fruit c=new Cherry("che");
		Apple af= (Apple) new Fruit("Amazing");
		
		a.taste();
		c.taste();
		a.createJam();

	}

}
