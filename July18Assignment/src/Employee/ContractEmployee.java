package Employee;
public class ContractEmployee extends Employee {
    private double hourlyWage;
    private float hoursWorked;

    public ContractEmployee(int empId, String name, double hourlyWage, float hoursWorked) {
        super(empId, name);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }

    public void displayDetails() {
        System.out.println("Contract Employee ID: " + getEmployeeId());
        System.out.println("Name: " + getEmployeeName());
        System.out.println("Salary: $" + calculateSalary());
    }
}
