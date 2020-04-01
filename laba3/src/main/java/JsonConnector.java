import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.util.ArrayList;

public class JsonConnector {

    private File studentFile = new File("Students.json");

    JsonConnector() throws IOException {
        if(!studentFile.exists())
            studentFile.createNewFile();
    }

    ArrayList<Student> readInfo() {
        ArrayList<Student> students = new ArrayList<Student>();
        try {
            FileReader reader = new FileReader(studentFile);
            JSONParser parser = new JSONParser();
            JSONArray arr = (JSONArray)parser.parse(reader);

            for(Object obj: arr) {
                JSONObject user = (JSONObject) obj;
                JSONObject userDetails = (JSONObject) user.get("Student");
                students.add(new Student((String)userDetails.get("name"), (Long)userDetails.get("age")));
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return students;
    }

    void writeInfo(ArrayList<Student> students) {

        JSONObject studentDetails;
        JSONObject newStudent;
        JSONArray studentsToSave = new JSONArray();

        for (Student student : students) {
            studentDetails = new JSONObject();
            studentDetails.put("name", student.getName());
            studentDetails.put("age", student.getAge());
            newStudent = new JSONObject();
            newStudent.put("Student", studentDetails);
            studentsToSave.add(newStudent);
        }

        try {

            FileWriter fileWriter = new FileWriter(studentFile);
            fileWriter.write(studentsToSave.toJSONString());
            fileWriter.flush();
            fileWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
