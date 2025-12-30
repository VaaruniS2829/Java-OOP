// Main class (only one public class)
public class FactoryMethodDemo {

    // Step 1: Interface
    interface Vehicle {
        void drive();
    }

    // Step 2: Car class
    static class Car implements Vehicle {
        public void drive() {
            System.out.println("Driving a Car");
        }
    }

    // Step 3: Bike class
    static class Bike implements Vehicle {
        public void drive() {
            System.out.println("Riding a Bike");
        }
    }

    // Step 4: Factory class
    static class VehicleFactory {

        // Factory Method
        public static Vehicle getVehicle(String type) {

            if (type.equalsIgnoreCase("car")) {
                return new Car();
            }
            else if (type.equalsIgnoreCase("bike")) {
                return new Bike();
            }
            else {
                return null;
            }
        }
    }

    // Step 5: main method
    public static void main(String[] args) {

        Vehicle v1 = VehicleFactory.getVehicle("car");
        v1.drive();

        Vehicle v2 = VehicleFactory.getVehicle("bike");
        v2.drive();
    }
}
