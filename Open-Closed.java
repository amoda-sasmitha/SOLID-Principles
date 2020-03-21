public class Employee {
    public void display() {
        System.out.println("I am a common employee");
    }
}
...
public class PermanentEmployee extends Employee {
    @Override
    public void display() {
        System.out.println("I am a permanent employee");
    }
}
...
public class ParttimeEmployee extends Employee {
    @Override
    public void display() {
        System.out.println("I am a part time employee");
    }
}
