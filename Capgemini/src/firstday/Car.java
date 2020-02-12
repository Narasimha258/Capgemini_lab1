package firstday;

public class Car {
	public void generalCar()
	{
		System.out.println("Common features ");
	}

}
class Moderncar extends Car
{
	public void racingCar()
	{
		System.out.println("additional Fetures");
	}
}
class Test
{
	public static void main(String args[])
	{
		Moderncar c1=new Moderncar();
		c1.racingCar();
	}
}
