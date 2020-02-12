package thirdclass;

public class NullPointEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//String s=null;
			//System.out.println(s.length());
			int x=4,y=0;
			int s1=x/y;
			System.out.println(s1);
			
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Dis");
		}

	}

}
