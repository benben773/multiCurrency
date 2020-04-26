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
    private currencyEnum currencyType;

    public Money(int amount, currencyEnum currency) {
        this.amount = amount;
        this.currencyType = currency;
    }
    public static Money doller(int amount){
        return  new Money(amount, currencyEnum.USD);
    }
    public static Money chf(int amount){
        return new Money(amount, currencyEnum.CHF);
    }

    public Money multiply(int param) {
        return new Money(amount * param,this.currencyType);
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object obj) {
        int amount = ((Money) obj).getAmount();
        return this.amount == amount && this.currencyType.equals(((Money) obj).currencyType);
    }
}
