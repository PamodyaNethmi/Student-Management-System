import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while(true){
            System.out.println("####### Welcome to Student Management System! #######");
            System.out.println("Press 1 for Adding a student");
            System.out.println("Press 2 for View all student");
            System.out.println("Press 3 for Removing a student");
            System.out.println("Press 4 for exit");
            System.out.println("Choose your option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); //create a new line

            switch (choice){
                case 1:
                    System.out.println("Enter student ID: ");
                    String id = scanner.nextLine();

                    System.out.println("Enter student Name: ");
                    String name = scanner.nextLine();

                    System.out.println("Enter student Age: ");
                    int age = scanner.nextInt();

                    Student newStudent = new Student(name, id, age);
                    manager.addStudents(newStudent);
                    break;

                case 2:
                    manager.displayAllStudent();
                    break;

                case 3:
                    System.out.println("Enter student ID to remove: ");
                    String removedId = scanner.nextLine();
                    manager.removeStudent(removedId);
                    break;

                case 4:
                    System.out.println("Exist system.....");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.\n");

            }
        }


    }
}
