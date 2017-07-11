package lesson8;

import lesson7.com.company.vehicles.Car;

public class SportCar extends Car {
    private double speed;

    public SportCar(String autoMark, String autoClass, int weight, double speed) {
        super(autoMark, autoClass, weight);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
