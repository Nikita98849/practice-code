package Java_Programming_Code;

public class transferStatement {

	public static void main(String[] args) {
//		break
		for(int i=0;i<=10;i++)
		{
			if(i==5)	
			   break;
			   System.out.print(i+" ");       //0 1 2 3 4 
			
		}
		System.out.println();
		/*if(true)       //break cannot be used outside of a loop or a switch
		{
			System.out.print("rantan");
	    	break;
	    	System.out.print("nandu");
		}*/
		
//		continue
		for(int i=0;i<=10;i++)
		{
			if(i==5)	  //5 skip
			   continue;
			   System.out.print(i+" ");       //0 1 2 3 4 6 7 8 9 10 
			
		}
		System.out.println();
		/*if(true)       //continue cannot be used outside of a loop
		{
			System.out.print("rantan");
			continue;
	    	System.out.print("nandu");
		}*/
		

	}

}
