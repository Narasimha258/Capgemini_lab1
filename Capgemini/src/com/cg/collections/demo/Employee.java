package com.cg.collections.demo;

public class Employee {
	private int empid;
	private String name;
	private double salary;
	Employee(int e,String n,double d)
	{
		empid=e;name=n;salary=d;
	}
	public int getEmpId()
	{
		return empid;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj==null)
			return false;
		
		if(obj==this)
			return true;
		
		Employee emp=(Employee)obj;
		return (emp.getEmpId()==this.getEmpId());
	    
	}
	public static void main(String args[])
	{
		Employee e1=new Employee(1,"nara",2300);
		Employee e2=new Employee(4,"nara",300);
		System.out.println(e1.equals(e2));
			
	}

}
