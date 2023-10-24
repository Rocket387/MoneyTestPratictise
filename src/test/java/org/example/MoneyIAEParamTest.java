package org.example;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

//IAE = Illegal Argument Exception

@RunWith(JUnitParamsRunner.class)
public class MoneyIAEParamTest {

    private final static int VALID_AMOUNT = 5;
    private final static String VALID_CURRENCY = "USD";

    private final static String VALID_NAME = "Steve";

    private static final Object[] getInvalidAmount() {
        return new Integer [] [] {{-12387}, {-5}, {-1}};
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "getInvalidAmount")
    public void constructorShouldThrowIAEForInvalidAmount(int invalidAmount) {
        new Money(invalidAmount, VALID_CURRENCY, VALID_NAME);
    }

    private static final Object[] getInvalidCurrency() {
        return new String[] [] {{null}, {""}};
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "getInvalidCurrency")
    public void constructorShouldThrowIAEForInvalidCurrency(String invalidCurrency) {
        new Money(VALID_AMOUNT, invalidCurrency, VALID_NAME);
    }

    private static final Object[] getInvalidName() {
        return new String[] [] {{null}, {""}};
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "getInvalidName")
    public void constructorShouldThrowIAEForInvalidName(String invalidName) {
        new Money(VALID_AMOUNT, VALID_CURRENCY, invalidName);
    }

}
