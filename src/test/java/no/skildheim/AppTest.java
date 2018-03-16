package no.skildheim;

import no.skildheim.controller.HomeController;
import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void testApp() {
        HomeController homeController = new HomeController();
        String result = homeController.home();
        Assert.assertEquals(result, "Das boot, reporting for duty");
    }
}
