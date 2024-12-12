import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();

                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();

                    manager.addStudent(new Student(id, name, age, course));
                    break;

                case 2:
                    manager.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID to search: ");
                    id = scanner.nextInt();
                    Student student = manager.searchStudent(id);
                    if (student != null) {
                        System.out.println(student);
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID to update: ");
                    id = scanner.nextInt();
                    manager.updateStudent(id);
                    break;

                case 5:
                    System.out.print("Enter Student ID to delete: ");
                    id = scanner.nextInt();
                    manager.deleteStudent(id);
                    break;

                case 6:
                    System.out.println("Exiting... Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
 {
    
}
