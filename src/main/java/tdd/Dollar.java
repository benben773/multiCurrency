package tdd;

/**
 * @author ：ls05
 * @date ：Created in 2020/4/25 19:55
 */
public class Dollar {
    private final int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar multiply(int param) {
        return new Dollar(amount * param);
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object obj) {
        int amount = ((Dollar) obj).getAmount();
        return this.amount == amount;
    }
}
