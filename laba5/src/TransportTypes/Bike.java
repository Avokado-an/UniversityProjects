package TransportTypes;

public class Bike extends Transport {
    public Bike() {
        costPerKm = 1;
        speed = 15;
    }

    public Bike(int costPerKm, int speed) {
        super(costPerKm, speed);
    }

    @Override
    public String toString() {
        return "Car" + super.toString();
    }
}
