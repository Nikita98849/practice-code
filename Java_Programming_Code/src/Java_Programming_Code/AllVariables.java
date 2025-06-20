package Java_Programming_Code;

public class AllVariables {

     int a=20,b=10;        //instance variable
	public void m1()        //instance method
	{
		AllVariables o=new AllVariables();
		System.out.println(o.a);
		System.out.println(o.b);
	}
	static public void m2()    //static method
	{
		AllVariables o=new AllVariables();
		System.out.println(o.a);
		System.out.println(o.b);
	}
	
	
	public static void main(String[] args) {
		
		//AllVariables.m1();   //Cannot make a static reference to the non-static method m1() from the type AllVariables
		AllVariables.m2();      //static method calling
	}

}
