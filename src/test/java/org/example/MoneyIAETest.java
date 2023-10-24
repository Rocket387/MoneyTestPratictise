package org.example;

import junitparams.Parameters;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyIAETest {

    private final static int VALID_AMOUNT = -5;
    private final static String VALID_CURRENCY = "";

    private final static String VALID_NAME = "";

    @Test(expected = IllegalArgumentException.class)
    public void constructorShouldThrowIAEForInvalidAmount() {

        new Money(VALID_AMOUNT, VALID_CURRENCY, VALID_NAME);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorShouldThrowIAEForInvalidCurrency() {

        new Money(VALID_AMOUNT, VALID_CURRENCY, VALID_NAME);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorShouldThrowIAEForInvalidName() {

        new Money(VALID_AMOUNT, VALID_CURRENCY, VALID_NAME);
    }
}
