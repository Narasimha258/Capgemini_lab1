package secondday;

public class StudentInfo {
	private String name;
	int roll_no;
	float cgpa;
	void setMethod(String s,int r,float f )
	{
		name=s;
		roll_no=r;
		cgpa=f;
	}
	void getMethod()
	{
		System.out.println("Name is:"+name+"\n Roll no is:"+roll_no+"\nCgpa is:"+cgpa);
	}
	

}
