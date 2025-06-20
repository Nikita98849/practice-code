class area
{
	int len,brdth;
	float radius;
	int side;
	final float pi=3.14f;
	
	area(int l,int b)
	{
		len=l;
		brdth=b;
		System.out.println("Area of rectangle :"+len*brdth);
	}
	
	area(float r)
	{
		radius=r;
		System.out.println("Area of triangle :"+2*pi*radius);
	}
	
	area(int s)
	{
		side=s;
		System.out.println("Area of square :"+side*side);
	}
		
}

public class Areas {
	public static void main(String arg[])
	{
		area a=new area(20,30);
		area a1=new area(1.5f);
		area a2=new area(5);
		
		
		
	}

}
