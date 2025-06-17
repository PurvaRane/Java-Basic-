class Vehicle {
    // Final method cannot be overridden in subclasses
    public final void displayType() {
        System.out.println("This is a vehicle.");
    }

    // Regular method (can be overridden)
    public void startEngine() {
        System.out.println("The vehicle's engine is starting.");
    }
}

class Car extends Vehicle {
    // Overriding the regular method
    @Override
    public void startEngine() {
        System.out.println("The car's engine is starting.");
    }

    // Attempt to override the final method will cause a compile-time error
    /*
    @Override
    public void displayType() {
        System.out.println("This is a car.");
    }
    */
}


public class C4FinalCM {
    public static void main(String[] args) {
        Car car = new Car();
        car.displayType();   // Output: This is a vehicle.
        car.startEngine();   // Output: The car's engine is starting.
    }
}
