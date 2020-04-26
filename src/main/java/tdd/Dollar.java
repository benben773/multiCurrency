package tdd;

/**
 * @author ：ls05
 * @date ：Created in 2020/4/25 19:55
 */
public class Dollar  extends Money {

    public Dollar(int amount) {
        super(amount);
    }

    public Dollar multiply(int param) {
        return new Dollar(amount * param);
    }
}
