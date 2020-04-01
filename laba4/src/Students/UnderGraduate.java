package Students;

public class UnderGraduate extends Student {

    public UnderGraduate() {
    }

    public UnderGraduate(String name, String speciality) {
        super(name, speciality);
    }

    @Override
    public String getMessage() {
        return toString();
    }

    @Override
    public String toString() {
        return "UnderGraduate{" +
                "name='" + name + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
