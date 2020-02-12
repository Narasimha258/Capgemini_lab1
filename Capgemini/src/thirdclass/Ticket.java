package thirdclass;

 class Ticket {
	public void getTicket()
	{
		System.out.println("Ticket");

    }
 }
 class ConformTicket extends Ticket{
	public void statusOfticket()
	{
		System.out.println("Checking");
	}
}
