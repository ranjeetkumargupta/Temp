package Company;
public class ContractEmployee extends Employee {
    private double hourlyWage;
    private int hoursWorked;

    public ContractEmployee(int empId, String name, double hourlyWage, int hoursWorked) {
        super(empId, name);
        this.hourlyWage = hourlyWage;
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
