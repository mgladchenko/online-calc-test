package step;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import page.CalcAppPage;

import static net.serenitybdd.core.Serenity.getDriver;
import static org.junit.Assert.*;

public class CalcSteps {
    CalcAppPage calcAppPage;

    @Step
    public CalcSteps openCalcApp() {
        getDriver().get("https://www.online-calculator.com/full-screen-calculator/");
        return this;
    }

    @Step
    public CalcSteps enterNumber(char[] number) {
        calcAppPage.enterNumber(number);
        return this;
    }

    @Step
    public CalcSteps selectOperation(char operation) {
        calcAppPage.selectOperation(operation);
        return this;
    }

    @Step
    public CalcSteps verifyScreenValue(String expectedScreenValue) {
        assertEquals("Wrong value displayed on screen.", expectedScreenValue, calcAppPage.getScreenValue());
        return this;
    }


}
