public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ivan", 19);
        System.out.println("Student " + student.getName() + " " + student.getAge() + " years old");
        System.out.println("Time spend: " + student.readCheckingTime() + "ms");
    }
}
