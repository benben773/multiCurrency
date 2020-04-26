package tdd;

import java.util.Currency;

/**
 * @author ：ls05
 * @date ：Created in 2020/4/26 22:09
 */
public class Money {
    public enum currencyEnum{
        CHF("CHF"),USD("USD");

        private String type;

        currencyEnum(String type) {
            this.type = type;
        }
    }
    protected final int amount;
    private String currency;
    private currencyEnum currencyType;

    public Money(int amount, currencyEnum currency) {
        this.amount = amount;
        this.currencyType = currency;
    }

    public static Money createMoney(int amount, currencyEnum currency) {
        if (currencyEnum.CHF.equals(currency)) {
            return new Chf(amount);
        }else if(currencyEnum.USD.equals(currency)){
            return new Dollar(amount);
        }
        return null;
    }

    public Money multiply(int param) {
        return createMoney(amount * param,this.currencyType);
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object obj) {
        int amount = ((Money) obj).getAmount();
        return this.amount == amount && getClass().equals(obj.getClass());
    }
}
