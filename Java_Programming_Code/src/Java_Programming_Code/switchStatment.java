package Java_Programming_Code;

public class switchStatment {

	public static void main(String[] args) {
	
//	first program
		
		final int b=10;           //int a=10;
		switch(b)
		{
		case b:
			System.out.println("A ="+b);
			break;
			
		default:
			System.out.println("correct choice");
		}
		
//		second program
		switch(b)
		{
		case 10:
			System.out.println("A");
			break;
			
		case 20:
			System.out.println("B");
			
		default:        
			System.out.println("correct choice");
		}

		//Internal conversion of Unicode a=97,A=65
		
		int a=65;
		 switch(a)          //a cannot be resolved to a variable
		 {
		 case 66: System.out.println("10");     break;
		 case 'A': System.out.println("20");     break;
		 default: System.out.println("default");   break;
		 }
		
		
//		 internal conversion unicodes
		 char ch='d';
		 switch(ch)          //a cannot be resolved to a variable
		 {
		 case 100: 
			 System.out.println("10");
			 break;
			 
		 case 'A': 
			 System.out.println("20");     
			 break;
			 
		 default: System.out.println("default");   
		 break;
		 
		 }
		 
//		 String argument
		 String str="aaa";
		 switch(str)
		 {
		 case "aaa":
			 System.out.println("aaa");
			 break;
			
		 default:
			 System.out.println("default");
			 
			 
		 }
		 

		

	}

}
