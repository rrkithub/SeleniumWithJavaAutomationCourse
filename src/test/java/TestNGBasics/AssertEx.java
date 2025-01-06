package TestNGBasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEx {
    @Test
    public void assertExample(){
        Assert.assertEquals(10,10);
        Assert.assertEquals("Automation","Automation");
        //Assert.assertEquals(10,20);
        //Assert.assertTrue(false,"Given condition was not matched ");
        //Assert.assertFalse(true,"Given condtion is mached");
        if(1==2){
            System.out.println("pass");
        }else{
            Assert.fail("Values are not matched");
        }
    }
}
