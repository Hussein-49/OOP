public class Patient extends Person {
    private String diagnosis;
    private double dailyRate;
    private int days;

    public Patient(String name, int age, String diagnosis, double dailyRate, int days){
        super(name, age);
        this.diagnosis = diagnosis;
        this.dailyRate = dailyRate;
        this.days = days;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setDailyRate(double dailyRate) {
        if(dailyRate<0){
            System.out.println("Enter positive value!");
            return;
        }
        this.dailyRate = dailyRate;
    }

    public void setDays(int days) {
        if(days<0){
            System.out.println("Enter positive value!");
            return;
        }

        this.days = days;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public int getDays() {
        return days;
    }

    @Override
    public void calculateBill(){
        double totalBill = dailyRate*days;
        System.out.println(totalBill);
    }

    @Override
    public void displayInfo(){
        System.out.print("Name: " + getName() + ", Age: "+ getAge() + ", Diagnosis: " + diagnosis + ", Total Bill: ");
        calculateBill();
    }
}
