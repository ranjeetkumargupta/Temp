package Company;
public class Tester {
    public static void main(String[] args) {
        PermanentEmployee permEmp1 = new PermanentEmployee(1, "John Doe", 5000, 2000, 2.5f);
        PermanentEmployee permEmp2 = new PermanentEmployee(2, "Jane Smith", 6000, 2500, 4.5f);

        ContractEmployee contEmp1 = new ContractEmployee(3, "Jim Beam", 50, 160);
        ContractEmployee contEmp2 = new ContractEmployee(4, "Jack Daniels", 55, 170);

        permEmp1.displayDetails();
        System.out.println();
        permEmp2.displayDetails();
        System.out.println();
        contEmp1.displayDetails();
        System.out.println();
        contEmp2.displayDetails();
    }
}
