package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class MoneyTest
{
    @Test
    public void constructorShouldSetAmountAndCurrency() {
        Money money = new Money(15, "USD", "Steve");

        assertEquals(15, money.getAmount());
        assertEquals("USD", money.getCurrency());
        assertEquals("Steve", money.getName());
   }

    @Test
    public void constructorShouldNotBeEqualAmountAndCurrency() {
        Money money = new Money(15, "USD", "Steve");

        assertNotEquals(12, money.getAmount());
        assertNotEquals("US", money.getCurrency());
        assertNotEquals("Simon", money.getName());
    }
}
