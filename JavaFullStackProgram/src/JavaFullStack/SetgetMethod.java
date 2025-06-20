package JavaFullStack;

public class SetgetMethod {
	
	private int a,b;
	public void set(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void sum()
	{
		System.out.println("Sum ="+(a+b));
	}
	public void sub()
	{
		System.out.println("Subtraction ="+(a-b));
	}
	
	public static void main(String arg[])
	{
		SetgetMethod s=new SetgetMethod();
		s.set(50,30);
		s.sum();
		s.sub();
	}

}