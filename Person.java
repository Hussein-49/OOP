public class Person{
    private String name;
    private int age;
    private static int count;

    public Person(){
        name = "Unknown";
        age = 0;
        count++;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        count++;
    }

    public void setAge(int age) {
        if(age<0 || age>120){
            System.out.println("Erorr!! Add the true value.");
            return;
        }
        
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public void displayInfo(){
        System.out.println("Name: " + name + ", Age: "+ age);
    }
    
    public void calculateBill(){
        System.out.println("No bill for general person.");
    }
    
    public static int getCount() {
        return count;
    }
    
    
}