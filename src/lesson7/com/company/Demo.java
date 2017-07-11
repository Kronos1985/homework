package lesson7.com.company;

import lesson7.com.company.details.Engine;
import lesson7.com.company.professions.Driver;
import lesson7.com.company.vehicles.Car;


public class Demo {
    public static void main(String[] args) {
        Car car = new Car("Bentley ", "A", 2500);
        Engine engine = new Engine("Bentley ", 300);
        Driver driver = new Driver("Семёнов Валерий Евгеньевич",32,5);
        car.setDriver(driver);
        car.setEngine(engine);
        car.start();
        car.stop();
        car.turnLeft();
        car.turnRight();
        car.printInfo();
    }
}

