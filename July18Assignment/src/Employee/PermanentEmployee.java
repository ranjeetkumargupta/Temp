package Employee;
public class PermanentEmployee extends Employee {
    private double basicPay;
    private double hra;
    private float experience;

    public PermanentEmployee(int empId, String name, double basicPay, double hra, float experience) {
        super(empId, name);
        this.basicPay = basicPay;
        this.hra = hra;
        this.experience = experience;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public double calculateMonthlySalary() {
        double variableComponent;
        if (experience < 3) {
            variableComponent = basicPay * 0.1;
        } else if (experience >= 3 && experience < 5) {
            variableComponent = basicPay * 0.2;
        } else {
            variableComponent = basicPay * 0.3;
        }
        return basicPay + hra + variableComponent;
    }

    public void displayDetails() {
        System.out.println("Permanent Employee ID: " + getEmployeeId());
        System.out.println("Name: " + getEmployeeName());
        System.out.println("Monthly Salary: $" + calculateMonthlySalary());
    }
}
