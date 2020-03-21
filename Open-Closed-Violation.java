public class Employee {
    private String type;
   
    public void display() {
        if ("permanent".equals(type)) {
            System.out.println("I am a permanent employee");
        } else if ("parttime".equals(type)) {
            System.out.println("I am a parttime employee");
        } else {
            System.out.println("I am a common employee");
        }
    }
}
