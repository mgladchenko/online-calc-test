package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import step.CalcSteps;

public class BaseTest {

    static {
        WebDriverManager.chromedriver().setup();
    }

    @Managed(driver = "chrome")
    WebDriver webDriver;

    @Steps
    CalcSteps calc;

}
