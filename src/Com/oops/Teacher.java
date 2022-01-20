package Com.oops;

public class Teacher {
	int salary=20000;
	Teacher()
	{
		System.out.println("This is teacher class constructor");
	}
	
	public void teacherMethod()
	{
		System.out.println("This is teacher class method");
	}

}

class JuniorTeacher extends Teacher
{
	
	int totalMarks=300;
	JuniorTeacher()
	{
		super(); //invoke super class constructor
	}
	
	public void JuniorTeacherTest()
	{
	  	
	  System.out.println(super.salary); //accessing super class instance variable
	  super.teacherMethod();//invoke super class method 
	 
	}
	
	
	
}


