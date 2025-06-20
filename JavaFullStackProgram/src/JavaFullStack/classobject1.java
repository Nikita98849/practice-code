package JavaFullStack;

class employee
{
	private String name;
	private float salary;
	
	public employee(String nm,float sal)
	{
		name=nm;
		salary=sal;
	}
		
	public String getname()
	{
		return name;
	}
	public float getsal()
	{
		return salary;
	}
	
	public void disp()
	{
		System.out.println("Employee name :"+name);
		System.out.println("Employee Salary :"+salary);
	}
}

public class classobject1 {	
	public static void main(String[] args) {
		employee e=new employee("Nikita",50000);
		e.getname();
		e.getsal();
		e.disp();
		
	}

}
