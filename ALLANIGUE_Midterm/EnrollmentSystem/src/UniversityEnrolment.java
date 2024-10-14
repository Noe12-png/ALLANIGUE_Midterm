import java.util.Scanner;  // Import Scanner class for user input

// Main Class
class Person {
    // name and age
    private String name;
    private int age;
    
    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}

// Subclass: Student
class Student extends Person {
    // Additional fields specific to students
    private String studentID;
    private String course;
    private int units;
    private final int feePerUnit = 1000; // constant value for fee per unit
    
    // Constructor to initialize all fields including those from Person
    public Student(String name, int age, String studentID, String course, int units) {
        super(name, age); // Call the constructor of the Person class
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }
    
    // Method to calculate total fees
    public double calculateFees() {
        return units * feePerUnit;
    }
    
    // Override displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the base class method
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + units);
        System.out.println("Total Fee: " + calculateFees());
    }
}

// Subclass: Instructor
class Instructor extends Person {
    // Additional fields specific to instructors
    private String employeeID;
    private String department;
    private double salary;
    
    // Constructor to initialize all fields including those from Person
    public Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age); // Call the constructor of the Person class
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    
    // Override displayInfo method to include instructor-specific information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the base class method
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Test Program to demonstrate functionality with user input
public class UniversityEnrolment {
    
    // Method to demonstrate polymorphism, accepts any Person type
    public static void printDetails(Person p) {
        p.displayInfo(); // Method based on the object type
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Scanner object to take user input
        
        // Details for first student from the user
        System.out.println("Enter details for Student 1:");
        System.out.print("Name: ");
        String name1 = input.nextLine();
        System.out.print("Age: ");
        int age1 = input.nextInt();
        input.nextLine();  // Consume the newline
        System.out.print("Student ID: ");
        String studentID1 = input.nextLine();
        System.out.print("Course: ");
        String course1 = input.nextLine();
        System.out.print("Units: ");
        int units1 = input.nextInt();
        input.nextLine();  // Consume the newline
        
        // Create first student object
        Student student1 = new Student(name1, age1, studentID1, course1, units1);
        
        // Details for second student
        System.out.println("\nEnter details for Student 2:");
        System.out.print("Name: ");
        String name2 = input.nextLine();
        System.out.print("Age: ");
        int age2 = input.nextInt();
        input.nextLine();  // Consume the newline
        System.out.print("Student ID: ");
        String studentID2 = input.nextLine();
        System.out.print("Course: ");
        String course2 = input.nextLine();
        System.out.print("Units: ");
        int units2 = input.nextInt();
        input.nextLine();  // Consume the newline
        
        // Create second student object
        Student student2 = new Student(name2, age2, studentID2, course2, units2);
        
        // Get details for first instructor
        System.out.println("\nEnter details for Instructor 1:");
        System.out.print("Name: ");
        String name3 = input.nextLine();
        System.out.print("Age: ");
        int age3 = input.nextInt();
        input.nextLine();  // Consume the newline
        System.out.print("Employee ID: ");
        String employeeID1 = input.nextLine();
        System.out.print("Department: ");
        String department1 = input.nextLine();
        System.out.print("Salary: ");
        double salary1 = input.nextDouble();
        input.nextLine();  // Consume the newline
        
        // Create first instructor object
        Instructor instructor1 = new Instructor(name3, age3, employeeID1, department1, salary1);
        
        // Get details for second instructor
        System.out.println("\nEnter details for Instructor 2:");
        System.out.print("Name: ");
        String name4 = input.nextLine();
        System.out.print("Age: ");
        int age4 = input.nextInt();
        input.nextLine();  // Consume the newline
        System.out.print("Employee ID: ");
        String employeeID2 = input.nextLine();
        System.out.print("Department: ");
        String department2 = input.nextLine();
        System.out.print("Salary: ");
        double salary2 = input.nextDouble();
        
        // Create second instructor object
        Instructor instructor2 = new Instructor(name4, age4, employeeID2, department2, salary2);
        
        // Display details using the printDetails method (demonstrates polymorphism)
        System.out.println("\n---- Student 1 Details ----");
        printDetails(student1);
        
        System.out.println("---- Student 2 Details ----");
        printDetails(student2);
        
        System.out.println("---- Instructor 1 Details ----");
        printDetails(instructor1);
        
        System.out.println("---- Instructor 2 Details ----");
        printDetails(instructor2);
        
        // Close the scanner
        input.close();
    }
}
