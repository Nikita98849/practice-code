package Java_Programming_Code;

public class loopingStatement {
	public static void main(String arg[])
	{
		
//		for loop
		for(int i=0;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		int i=0;
		for(;i<=5;)
		{
			
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		
//	do while loop
	     i=0;
	     do {
	    	 System.out.print("nikita ");
	    	 i++;
	     }
	     while(i<=5);
		
	     //unreachable statement
	     
	     System.out.println();
	     i=0;
	     do
	     {
	    	 System.out.print("Aaru");
	    	 
	     }
	     while(false); //true
	     System.out.println("Aanu");
	     
//	     for each loop
	     System.out.println();
	     for(int k:a)
	     {
	    	 System.out.print(k+" ");
	     }
		
	}

}
