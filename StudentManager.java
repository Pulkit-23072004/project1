import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

   
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    
    public Student searchStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    
    public void updateStudent(int id) {
        Student student = searchStudent(id);
        if (student == null) {
            System.out.println("Student not found!");
            return;
        }
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter new name: ");
        student.setName(scanner.nextLine());

        System.out.print("Enter new age: ");
        student.setAge(scanner.nextInt());

        scanner.nextLine(); // Consume the newline
        System.out.print("Enter new course: ");
        student.setCourse(scanner.nextLine());

        System.out.println("Student updated successfully!");
    }

    
    public void deleteStudent(int id) {
        Student student = searchStudent(id);
        if (student == null) {
            System.out.println("Student not found!");
            return;
        }
        students.remove(student);
        System.out.println("Student deleted successfully!");
    }
}
 {
    
}
