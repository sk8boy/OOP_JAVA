package chapter04.car;

public class GasolineCar extends Car {
    int fuelCapacity;
    int currentFuelLevel;

    public void refuel(int fuelAmount) {
        currentFuelLevel += fuelAmount;
        System.out.println("Current fuel level: " + currentFuelLevel);
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
        System.out.println(car.toString());
//        car.brand = "TOYOTA";
//        car.model = "RAV4";
//        car.speed = 0;
//        car.setSpeed(0);
//        car.status = Status.OFF;
//        car.start();
//        car.printStatus();
//        car.accelerate();
////        car.brand = "BMW";
//        car.printStatus();
//        car.brake();
//        car.printStatus();
//
//        Car car2 = new Car("BMW", "X3");
//        car2.setSpeed(0);
//        car2.status = Status.OFF;
//        car2.accelerate(10);
//        car2.printStatus();
//
//        ElectricCar car3 = new ElectricCar("Model Y", "Tesla", 50);
//        car3.start();
//        car3.printStatus();

//        System.out.println(VM.current().details());
    }
}
