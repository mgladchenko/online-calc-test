package page;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.Keys.*;

public class CalcAppPage extends PageObject {

    @FindBy(xpath = "//iframe[@id='fullframe']")
    private WebElement calcAppIFrame;

    public String getScreenValue() {
        getDriver().switchTo().frame(calcAppIFrame);
        String screenValue = (String) evaluateJavascript("return exportRoot.showscreen_txt.text;");
        getDriver().switchTo().defaultContent();
        return screenValue;
    }

    public void enterValue(String value) {
        //ToDo: validate input is 9 digits with decimal and negative sign via regexp
        char[] valueChars = value.toCharArray();
        boolean isValueNegative = valueChars[0] == '-';
        for (char valueChar : valueChars) {
            switch (valueChar) {
                case '0':
                    calcAppIFrame.sendKeys(NUMPAD0);
                    break;
                case '1':
                    calcAppIFrame.sendKeys(NUMPAD1);
                    break;
                case '2':
                    calcAppIFrame.sendKeys(NUMPAD2);
                    break;
                case '3':
                    calcAppIFrame.sendKeys(NUMPAD3);
                    break;
                case '4':
                    calcAppIFrame.sendKeys(NUMPAD4);
                    break;
                case '5':
                    calcAppIFrame.sendKeys(NUMPAD5);
                    break;
                case '6':
                    calcAppIFrame.sendKeys(NUMPAD6);
                    break;
                case '7':
                    calcAppIFrame.sendKeys(NUMPAD7);
                    break;
                case '8':
                    calcAppIFrame.sendKeys(NUMPAD8);
                    break;
                case '9':
                    calcAppIFrame.sendKeys(NUMPAD9);
                    break;
                case '.':
                    calcAppIFrame.sendKeys(DECIMAL);
                    break;
            }
            if (isValueNegative) {
                calcAppIFrame.sendKeys(SUBTRACT);
            }
        }
    }

    public void selectOperation(String operation) {
        if (!operation.matches("^(\\+{1}|-{1}|\\/{1}|\\*{1}|C{1})$")) {
            throw new Error("Operation should be one of: +, -, /, *, =, C ");
        }

        switch (operation) {
            case "/":
                calcAppIFrame.sendKeys(DIVIDE);
                break;
            case "*":
                calcAppIFrame.sendKeys(MULTIPLY);
                break;
            case "-":
                calcAppIFrame.sendKeys(SUBTRACT);
                break;
            case "+":
                calcAppIFrame.sendKeys(ADD);
                break;
            case "=":
                calcAppIFrame.sendKeys(EQUALS);
                break;
            case "C":
                calcAppIFrame.sendKeys("C");
                break;
        }
    }

}
