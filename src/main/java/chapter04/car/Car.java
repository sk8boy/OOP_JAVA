package chapter04.car;

public class Car {
    private String brand;
    private String model;
    private int speed;
    // 0: off, 1: on, 2: running 3: unknown
    Status status;

    public Car() {
        this.brand = "TOYOTA";
        this.model = "RAV4";
        this.speed = 0;
        this.status = Status.OFF;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
        this.status = Status.OFF;
    }

    public void start() {
        status = Status.ON;
        System.out.println("Car start");
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void stop() {
        status = Status.OFF;
        System.out.println("Car stop");
    }

    public void accelerate() {
        status = Status.RUNNING;
        speed += 5;
        System.out.println("Car accelerate");
    }

    public void accelerate(int speed) {
        this.speed += speed;
        System.out.println("Car accelerate " + speed);
    }

    public void brake() {
        speed -= 5;
        System.out.println("Car brake");
    }

    public void printStatus() {
        System.out.println("Car " + brand + " " + model + " " + speed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                ", status=" + status +
                '}';
    }
}

enum Status {
    OFF, ON, RUNNING, UNKNOWN;
}