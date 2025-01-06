package TestNGBasics;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListernEx.class)
public class ListnerTestEx {
    @Test
    public void test1() {
        Assert.assertEquals(10, 10);
    }

    @Test
    public void test2() {
        Assert.assertEquals(10, 20);
    }

    @Test
    public void test3() {
        throw new SkipException("This test is skipped");
    }
}
