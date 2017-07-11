package lesson8;

import lesson7.com.company.details.Engine;
import lesson7.com.company.professions.Driver;

public class DemoCar {
    public static void main(String[] args) {
        Lorry lorry  = new Lorry("Mercedes","A",2500,200);
        SportCar sportCar = new SportCar("Mazda RX","B",1000,340);
        Driver driver = new Driver("Семёнов Валерий Евгеньевич", 32, 10);
        Driver driver1 = new Driver("Владимиров Сергей Александрович", 65, 20);
        Engine engine = new Engine("Mercedes",600);
        Engine engine1 = new Engine("Mercedes",400);
        lorry.setDriver(driver);
        lorry.setEngine(engine);
        sportCar.setDriver(driver1);
        sportCar.setEngine(engine1);
        System.out.println(lorry);
        System.out.println(sportCar);
    }
}

