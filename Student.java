
class Student_info
{
	String name;
	int age;
	String address;
	
	
	public Student_info(String name, int age, String address) 
	
	{
		
		this.name = name;
		this.age = age;
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() 
	{
		return "Student_info name is " + name + ", age is " + age + ", address is " + address;
	}
	
	
	
}


public class Student 

{

	public static void main(String[] args) 
	
	{
		Student_info john=new Student_info("john", 34, "34,East Road, US");
		System.out.println(john.toString());

	}

}
