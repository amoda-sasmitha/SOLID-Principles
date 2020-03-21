public interface Department { }

public class MainDepartment impliments Department { }

public class SubDepartment impliments Department { }

public class Employee {
 
    private Department department;
 
    public Employee(Department department) {
        this.department = department;
    }
 
}
