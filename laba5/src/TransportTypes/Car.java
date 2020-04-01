package TransportTypes;

public class Car extends Transport  {
    public Car() {
        costPerKm = 5;
        speed = 100;
    }

    public Car(int costPerKm, int speed) {
        super(costPerKm, speed);
    }

    @Override
    public String toString() {
        return "Car" + super.toString();
    }
}
