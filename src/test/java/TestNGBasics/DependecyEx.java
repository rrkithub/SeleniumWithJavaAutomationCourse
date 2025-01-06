package TestNGBasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependecyEx {
    @Test(priority = 1)
    public void startCar() {
        System.out.println("car Started");
    }


    @Test(priority = 2, dependsOnMethods = {"startCar"})
    public void driveCar() {
        System.out.println("Drivinng the Car...");
        Assert.fail("Unable to drive the car");
    }

    @Test(priority = 3, dependsOnMethods = {"driveCar"})
    public void stopCar() {
        System.out.println("Car Stopped");
    }

    @Test(priority = 4, dependsOnMethods = {"driveCar", "stopCar"},alwaysRun = true)
    public void parkCar() {
        System.out.println("Car Parked");
    }
}
