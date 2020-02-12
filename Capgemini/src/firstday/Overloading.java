package firstday;

public class Overloading {
	int a,b;
	int s1=0;
	//float c,d;
	float s2=0;
	public void addFun(int a,int b)
	{
		//this.a=a;
		//this.b=b;
		//s1=a+b;
		System.out.println(a+b);
	}
	public void addFun(float c,float d)
	{
		//this.c=c;
		//this.d=d;
		//s2=c+d;
		System.out.println("Sum of float num is:"+s2);
	}

}
