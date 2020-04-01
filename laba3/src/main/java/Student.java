public class Student {
    private String name;
    private Long age;

    public Student(String name, Long age) {
        this.name = name;
        this.age = age;
    }

    public Long getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
