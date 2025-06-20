package JavaFullStack;

class Student {
    private int id;    
    private String name;
    
    
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    
    public void printStudent(String h) {
        System.out.println(h);
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
    }
    public int getId() { return id; }
    public String getName() { return name; }
}

class method_MethodPassing {
    public static void main(String[] args) {
        
        Student obj = new Student(28, "Geek");  
       
        obj.printStudent("Student Details:"); 
    }
}