public interface Work {
    void workonWeekdays();
    void workonWeekend();
}
...
public class Employee implements Work {
    
    public void workonWeekdays() {
         System.out.println("I am work on weekdays");
    }
    public void workonWeekend() {
        throw new IllegalStateException("normal employees not work on weekends");
    }
}
...
public class PermanentEmployee extends Employee {
    
    @Override
    public void workonWeekdays() {
         System.out.println("I am work on weekdays");
    }
    
    @Override
    public void workonWeekend() {
         System.out.println("I am work also on weekends");
    }
}
