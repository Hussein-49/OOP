public class Main {
    public static void main(String[] args) {
        Person person = new Person("Hussin", 18);
        Patient patient = new Patient("Ali", 17, null, 3.5, 15);

        person.displayInfo();
        person.calculateBill();

        System.out.println("\n-----------------------------------------\n");

        patient.displayInfo();
        patient.calculateBill();
        
    }
}
