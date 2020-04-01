package TransportTypes;

public class Transport {
    protected int costPerKm;
    protected int speed;

    public Transport() {
    }

    public Transport(int costPerKm, int speed) {
        this.costPerKm = costPerKm;
        this.speed = speed;
    }

    public int getCostPerKm() {
        return costPerKm;
    }

    public void setCostPerKm(int costPerKm) {
        this.costPerKm = costPerKm;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double countTimeOfTravel(int distance) {
        return (double)distance/speed;
    }

    public int countCostOfTravel(int distance) {
        return distance*costPerKm;
    }

    @Override
    public String toString() {
        return "{" +
                "costPerKm=" + costPerKm +
                "$, speed=" + speed +
                "km/h}";
    }
}
