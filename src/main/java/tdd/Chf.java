package tdd;

/**
 * @author ：ls05
 * @date ：Created in 2020/4/25 19:55
 */
public class Chf {
    private final int amount;

    public Chf(int amount) {
        this.amount = amount;
    }

    public Chf multiply(int param) {
        return new Chf(amount * param);
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object obj) {
        int amount = ((Chf) obj).getAmount();
        return this.amount == amount;
    }
}
