class Student {
    String name;
    int age;
    String course;

    // Default constructor
    Student() {
        this("Unknown", 18, "Not Assigned");  // Calls another constructor in the same class
        System.out.println("Inside Default Constructor");
    }

    // Parameterized constructor 1
    Student(String name) {
        this(name, 18, "Not Assigned");  // Calls another constructor in the same class
        System.out.println("Inside Constructor with Name");
    }

    // Parameterized constructor 2
    Student(String name, int age) {
        this(name, age, "Not Assigned");  // Calls another constructor in the same class
        System.out.println("Inside Constructor with Name and Age");
    }

    // Parameterized constructor 3
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println("Inside Constructor with Name, Age, and Course");
    }

    // Method to display student information
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Student s1 = new Student();  // Calls default constructor
        s1.displayInfo();

        System.out.println("---");

        Student s2 = new Student("John");  // Calls constructor with name
        s2.displayInfo();

        System.out.println("---");

        Student s3 = new Student("Alice", 22);  // Calls constructor with name and age
        s3.displayInfo();

        System.out.println("---");

        Student s4 = new Student("Bob", 25, "Computer Science");  // Calls constructor with all parameters
        s4.displayInfo();
    }
}
