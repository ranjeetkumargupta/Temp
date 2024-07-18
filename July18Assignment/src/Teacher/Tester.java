package Teacher;
public class Tester {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Alice Johnson", "Java Fundamentals", 1200.0);
        Teacher teacher2 = new Teacher("John", "RDBMS", 800.0);
        Teacher teacher3 = new Teacher("Sam", "Networking", 900.0);
        Teacher teacher4 = new Teacher("Maria", "Python", 900.0);

        Teacher[] teachers = { teacher1, teacher2, teacher3, teacher4 };

        for (Teacher teacher : teachers) {
            teacher.displayDetails();
            System.out.println();
        }
    }
}
