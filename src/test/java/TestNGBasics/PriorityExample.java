package TestNGBasics;

import org.testng.annotations.Test;

public class PriorityExample {
    @Test(priority = 1)
    public void bc() {
        System.out.println("Url launched");
    }

    @Test(priority = 3,invocationCount = 5)
    public void ca() {
        System.out.println("verified Title");
    }

    @Test(priority = 10 ,enabled = false)
    public void ac() {
        System.out.println("logged out from app");
    }
}
