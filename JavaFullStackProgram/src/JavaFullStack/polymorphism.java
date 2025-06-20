package JavaFullStack;

class Parent {
    public void func() {
        System.out.println("Parent.func()");
    }
    
    public void func(int a) {
        System.out.println("Parent.func(int): " + a);
    }
}

class Child extends Parent {
    @Override
    public void func(int a) {
        System.out.println("Child.func(int): " + a);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
    
        Parent polymorphicObj = new Child();  
 
        parent.func();       
        parent.func(10);    
        child.func(20);     
        polymorphicObj.func(30);  
    }
}





