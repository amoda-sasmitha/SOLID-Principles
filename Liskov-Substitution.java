public interface Employee {
 
    public void displayPayments();
    public void displayBonus();
}

public class PermanentEmployee implements Employee {
 
    private Bonus bonus;
    
    public void displayPayments() {
         System.out.println("I got LKR 25,000 as my payment");
    }
 
    public void displayBonus() {
         System.out.println("I got LKR " + bonus.amount + " as my bonus");
    }
}

public class ParttimeEmployee implements Employee {

    public void displayPayments() {
         System.out.println("I got LKR 10,000 as my payment");
    }
 
    public void displayBonus() {
        throw new AssertionError("I don't have a bonus!");
    }
}



