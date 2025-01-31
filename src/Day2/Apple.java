package Day2;

public class Apple extends Fruit{

	public Apple(String name) {
		super(name);
		System.out.println("In Apple constructor");
	}
	public void taste()
	{
		System.out.println("taste override in Apple");
	}
	public void createJam()
	{
		System.out.println("Apple created Jam");
	}
	

}
