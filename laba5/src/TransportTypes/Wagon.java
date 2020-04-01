package TransportTypes;

public class Wagon extends Transport {
    public Wagon() {
        costPerKm = 10;
        speed = 50;
    }

    public Wagon(int costPerKm, int speed) {
        super(costPerKm, speed);
    }

    @Override
    public String toString() {
        return "Wagon" + super.toString();
    }
}
