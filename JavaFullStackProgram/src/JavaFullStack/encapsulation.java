package JavaFullStack;

class Employee {
    private int id;
    private String name;

    public void set(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.set(101, "Nikita");

        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
    }
}
