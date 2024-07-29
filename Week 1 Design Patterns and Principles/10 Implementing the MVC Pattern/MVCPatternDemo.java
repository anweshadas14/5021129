
public class MVCPatternDemo {
    public static void main(String[] args) {

        System.out.println();

        // Create a Student object
        Student model = new Student("Anwesha Das", 1, "A");
        
        // Create a StudentView object
        StudentView view = new StudentView();
        
        // Create a StudentController object
        StudentController controller = new StudentController(model, view);
        
        // Display the initial student details
        controller.updateView();
        
        // Update student details
        controller.setStudentName("Abhi Bhowal");
        controller.setStudentGrade("B");
        
        // Display the updated student details
        controller.updateView();
    }
}
