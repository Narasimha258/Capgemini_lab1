package firstday;

public class Smartwatch extends Normalwatch{
	public void stepsTracker()
	{
		super.timeShowing();
		super.dateShowing();
		System.out.println("It shows the no of  steps");
	}
	public void callingTexting()
	{
		System.out.println("It works as a smartphone");
	}

}
