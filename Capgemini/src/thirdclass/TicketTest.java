package thirdclass;

public class TicketTest {

	public static void main(String[] args) {
		ConformTicket tk=new ConformTicket();
		if(tk instanceof Ticket)
		{
			System.out.println("Ya it is true");
		}

	}

}
