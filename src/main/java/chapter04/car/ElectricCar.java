package chapter04.car;

public class ElectricCar extends Car {
    protected int batteryCapacity;
    int currentChargeLevel;
    String brand;

    public ElectricCar(String model, String brand, int batteryCapacity) {
        super(brand, model);
        this.batteryCapacity = batteryCapacity;
        this.currentChargeLevel = 0;
        this.brand = "XXX";
    }

    @Override
    public void printStatus() {
        super.printStatus();
        System.out.println("Battery Capacity: " + batteryCapacity);
        System.out.println("Current Charge Level: " + currentChargeLevel);
        System.out.println("Brand: " + brand);
    }

    public void recharge(int chargeAmount) {
        currentChargeLevel += chargeAmount;
        System.out.println("Current charge level: " + currentChargeLevel);
    }
}
