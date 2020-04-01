import Students.Graduate;
import Students.Student;
import Students.UnderGraduate;

public class Executable {
    public static void main(String[] args) {
        Student graduate = new Graduate("Alex", "Mechanics");
        Student underGraduate = new UnderGraduate("Ivan", "Chemistry");
        System.out.println(graduate.getMessage());
        System.out.println(underGraduate.getMessage());
    }
}
