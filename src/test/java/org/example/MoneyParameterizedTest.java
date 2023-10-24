package org.example;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class MoneyParameterizedTest {

    private static final Object[] getMoney() {
        return new Object[] {
                new Object[] {10, "USD", "Bob"},
                new Object[] {20, "EUR", "Ben"}
        };
    }

    @Test
    @Parameters(method = "getMoney")
    public void constructorShouldSetAmountAndCurrency2(int amount, String currency, String name) {
        Money money = new Money(amount, currency, name);

        assertEquals(amount, money.getAmount());
        assertEquals(currency, money.getCurrency());
        assertEquals(name, money.getName());
    }

}
