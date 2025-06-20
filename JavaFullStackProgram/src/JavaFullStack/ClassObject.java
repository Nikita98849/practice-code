package JavaFullStack;

public class ClassObject {
	
	private int a;
    private int b;

    // Setter methods
    public void set(int a,int b)
     {
    	this.a = a; 
    	this.b=b;
    
    }
    
    // Methods
    public void sum() { System.out.println(a + b); }
    public void sub() { System.out.println(a - b); }

	public static void main(String[] args) {
		ClassObject c=new ClassObject();
		c.set(40,20);
		c.sum();
		c.sub();
		
	
	}

}
