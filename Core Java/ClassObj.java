
class Student
{
	String name; //varaibles or propeties
	int age;
	void study()  //method function or actions
	{
		System.out.println(name+" is stuyding");
	}
}

public class ClassObj
{
	public static void main(String[] args) 
	{
		System.out.println("Hello Swift....");
		Student std=new Student();  // object creation
		//access variable of student
			
		std.name="Ashwani"; //assign values
		std.age=24;
		
		std.study();  //calling of method
			
	}
}