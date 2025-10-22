import java.util.ArrayList;

public class StudentManager {
    //studentArray List
    private ArrayList<Student> studentArray = new ArrayList<>();

    //add student

    public void addStudents(Student student){
        studentArray.add(student);
        System.out.println("Student added successfully! \n");
    }

    //display all students

    public void displayAllStudent(){
        for(Student student: studentArray){ //  for each loop
            student.displayInfo();
        }
        System.out.println();
    }

    //remove students
    public void removeStudent(String id){
        boolean found= false;
       for(Student student: studentArray){
           if(student.getId().equalsIgnoreCase(id)){
               studentArray.remove(student);
               System.out.println("Student removed successfully!");
               found = true;
               break;
           }
       }if(!found){
           System.out.println("No student found with id: " + id + "\n");
        }
    }
}
