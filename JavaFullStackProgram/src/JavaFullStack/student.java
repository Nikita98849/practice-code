
public class student {
		int age;
		String name;
		int id;
		
		student(int a,String nm,int sid)
		{
			age=a;
			name=nm;
			id=sid;
			
		}
		void disp()
		{
			System.out.println("age ="+age+" "+"\nname ="+name+" "+"\nid "+id);
		}
		
		
    public static void main(String arg[])
    {
    	
	  student s=new student(21,"Nikita",123);
	    s.disp();
    }
	

}
