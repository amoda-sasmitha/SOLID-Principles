public interface WeekdayWork {
    void workonWeekdays();
}

public interface WeekendWork {
    void workonWeekend();
}
...
public class Employee implements WeekdayWork {
    
    public void workonWeekdays() {
         System.out.println("I am work on weekdays");
    }
}
...
public class PermanentEmployee extends Employee implements WeekendWork {
    
    @Override
    public void workonWeekdays() {
         System.out.println("I am work on weekdays");
    }
    
    @Override
    public void workonWeekend() {
         System.out.println("I am work also on weekends");
    }
}
