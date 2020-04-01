import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        JsonConnector connector = new JsonConnector();
        ArrayList<Student> students;

        System.out.println("JSON File: ");
        students = connector.readInfo();
        students.add(new Student("6", 4L));
        for(Student student: students)
            System.out.println(student.toString());
        connector.writeInfo(students);
    }
}
