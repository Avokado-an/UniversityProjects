package Students;

public class Graduate extends Student {

    @Override
    public String toString() {
        return "Graduate{" +
                "name='" + name + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }

    public Graduate() {
    }

    public Graduate(String name, String speciality) {
        super(name, speciality);
    }

    @Override
    public String getMessage() {
        return toString();
    }
}
