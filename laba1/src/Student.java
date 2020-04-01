import java.io.*;
import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String fileInfo;
    private File file = new File("TextFile");

    public Student(String name, int age) {
        this.name = name;
        checkAge(age);
    }

    private void checkAge(int age) {
        try {
            if (age <= 12) {
                throw new AgeException("Too young");
            }
            else {
                this.age = age;
            }
        } catch(AgeException e) {
            System.out.println(e);
            this.age = 18;
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getFileInfo() {
        return fileInfo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFileInfo(String fileInfo) {
        this.fileInfo = fileInfo;
    }

    private String readFile() {
        StringBuilder res = new StringBuilder();
        try(FileInputStream reader = new FileInputStream(file)) {
            Scanner scan = new Scanner(reader);
            while(scan.hasNextLine()) {
                String sca = scan.nextLine();
                //System.out.println(sca);
                res.append(sca + "\n");//String.valueOf(reader.read()));
            }
        }
        catch(FileNotFoundException e) {
            createFile();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return res.toString();
    }

    public long readCheckingTime() {
        long start = System.currentTimeMillis();
        System.out.println("File info:\n" + readFile());
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    private void createFile() {
        try {
            FileOutputStream out = new FileOutputStream(file);
            System.out.println("File did not exist, so I created it, but it's still empty");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
