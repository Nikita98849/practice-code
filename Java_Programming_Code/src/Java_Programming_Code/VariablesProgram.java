package Java_Programming_Code;

public class VariablesProgram {

	int a=10,b=20;
	static int c=30,d=40;
	public void m1()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);                      //direct accessing static variable
		System.out.println(VariablesProgram.d);     //by using class name  
		
	}
	static public void m2()
	{
		VariablesProgram o=new VariablesProgram();
		System.out.println(o.a);
		System.out.println(o.b);
		System.out.println(c);                      //direct accessing static variable
		System.out.println(VariablesProgram.d);      //by using class name  
		System.out.println(o.d);                     //by using reference variable
		
	}
	
	public static void main(String[] args) {
		
		VariablesProgram o=new VariablesProgram();
		System.out.println("By using intance method/non static method");
		o.m1();
		System.out.println("By using static method");
		VariablesProgram.m2();
		
		System.out.println("By using local variable");
		int n=80;                        //int a;  the local variable the jvm does not provide default value 
 		System.out.println(n);
 		int m;                            //valid 
		
		
	}

}
