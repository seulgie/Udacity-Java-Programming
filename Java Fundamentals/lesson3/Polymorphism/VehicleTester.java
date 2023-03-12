/* Polymorphism */

public class VehicleTester {

    public static void main() {
        // We can create an array of vehicles 
        Vehicle[] vehicles = new Vehicle[3];
      
        // Add a Car, Plane and Boat objects to the array 
        vehicles[0] = new Car();
        vehicles[1] = new Plane();
        vehicles[2] = new Boat();
        
        polymorphism(vehicles);
    }
    
    public static void polymorphism(Vehicle[] vehicles) {
    // Iterate over the array and call the start methods 
        for (int i = 0; i < vehicles.length; i++) {
            Vehicle vehicle = vehicles[i];
            vehicle.speed();
        }
    }
    
    public static void coupling() {
        // Add a Car, Plane and Boat objects to the array
        Car car = new Car();
        Plane plane = new Plane();
        Boat boat = new Boat();
        
        car.speed();
        plane.speed();
        boat.speed();
    }
    
}


