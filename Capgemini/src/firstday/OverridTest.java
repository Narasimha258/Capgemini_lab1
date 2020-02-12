package firstday;

public class OverridTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box d=new Box();
		d.display();
		d=new Derived();
		d.display();
	}

}
