package JavaFullStack;

public class multipleCatchBlock {

	public static void main(String[] args) {
		try
		{
			int arr[]=new int[5];
			arr[5]=100;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic error :"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index out of bounds"+e);
		}
		catch(Exception e)
		{
			System.out.println("Generic Exception :"+e);
		}

	}

}
