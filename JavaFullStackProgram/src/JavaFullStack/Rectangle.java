
 class demo
{
	 int length,breadth;
	 demo(int len,int brdth)
	 {
		 length=len;
		 breadth=brdth;
		 
	 }
	 public void disp()
	 {
		 int area=length*breadth;
		 System.out.println("Area of rectangle ="+area);
	 }
	
}

public class Rectangle {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		demo a=new demo(20,50);
		System.out.println("Length of Rectangle :"+a.length);
		System.out.println("Breadth of Rectangle :"+a.breadth);
		
		a.disp();
		

	}

}
