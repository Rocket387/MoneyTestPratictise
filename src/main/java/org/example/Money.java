package org.example;

/**
 * Hello world!
 *
 */
public class Money
{
    private final int amount;
    private final String currency;

    private final String name;

    public Money(int amount, String currency, String name) {
        if(amount < 0) {
            throw new IllegalArgumentException("illegal amount: [" + amount + "]");
        }
        if(currency == null || currency.isEmpty()) {
            throw new IllegalArgumentException("illegal currency: [" + currency + "]");
        }
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("illegal name: [" + name + "]");
        }

        this.amount = amount;
        this.currency = currency;
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object anObject) {
        if (anObject instanceof Money) {
            Money money = (Money) anObject;
            return money.getCurrency().equals(getCurrency())
                    && getAmount() == money.getAmount() && money.getName().equals(getName());
        }
        return false;
    }

}
