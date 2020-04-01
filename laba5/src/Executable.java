import TransportTypes.Bike;
import TransportTypes.Car;
import TransportTypes.Transport;
import TransportTypes.Wagon;

import java.util.Scanner;

public class Executable {
    public static void main(String[] args) {
        Transport wagon = new Wagon();
        Transport bike = new Bike();
        Transport car = new Car();

        int distance = inputWithMessage("Distance to go through (km)");

        show(mainOutput(wagon, distance));
        show(mainOutput(bike, distance));
        show(mainOutput(car, distance));
    }

    private static String mainOutput(Transport transport, int distance) {
        return transport.toString() + "\n"
                + "cost = " + transport.countCostOfTravel(distance) + "$; time = " + transport.countTimeOfTravel(distance) + " hour(s)"
                + "\n--------------------------------------------------------";
    }

    private static int inputWithMessage(String msg) {
        show(msg);
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private  static  void show(String msg) {
        System.out.println(msg);
    }
}
