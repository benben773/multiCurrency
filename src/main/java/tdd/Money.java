package tdd;

/**
 * @author ：ls05
 * @date ：Created in 2020/4/26 22:09
 */
public class Money {
    protected final int amount;

    public Money(int amount) {
        this.amount = amount;
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
