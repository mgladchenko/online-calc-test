package step;

import net.thucydides.core.annotations.Step;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import page.CalcAppPage;

import static net.serenitybdd.core.Serenity.getDriver;
import static org.junit.Assert.*;

public class CalcSteps {
    CalcAppPage calcAppPage;

    @Step
    @Given("I open online Calc app")
    public CalcSteps openCalcApp() {
        getDriver().get("https://www.online-calculator.com/full-screen-calculator/");
        return this;
    }

    @Step
    @When("I enter $value value")
    public CalcSteps enterValue(String value) {
        calcAppPage.enterValue(value);
        return this;
    }

    @Step
    @When("I select $operation operation")
    public CalcSteps selectOperation(String operation) {
        calcAppPage.selectOperation(operation);
        return this;
    }

    @Step
    @Then("I should see $expectedScreenValue value on screen")
    public CalcSteps verifyScreenValue(String expectedScreenValue) {
        assertEquals("Wrong value displayed on screen.", expectedScreenValue, calcAppPage.getScreenValue());
        return this;
    }

}
