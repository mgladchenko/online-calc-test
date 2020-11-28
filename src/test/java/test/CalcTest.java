package test;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class CalcTest extends BaseTest {

    @Test
    public void multiplyOperationTest() {
        calc
                .openCalcApp()
                .verifyScreenValue("0")
                .enterNumber(new char[] {'2'})
                .verifyScreenValue("2")
                .selectOperation('*')
                .enterNumber(new char[] {'2'})
                .selectOperation('=')
                .verifyScreenValue("4")
                .selectOperation('C')
                .verifyScreenValue("0");
    }

}
