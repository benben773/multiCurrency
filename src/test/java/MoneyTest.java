import org.junit.Test;
import tdd.Money;

import static org.junit.Assert.*;

/**
 * @author ：ls05
 * @date ：Created in 2020/4/25 19:51
 */
public class MoneyTest {

    @Test
    public void assertEquals(){
        assertFalse(Money.doller(10).equals(Money.chf(5).multiply(2)));
        assertTrue(Money.doller(10).equals(Money.doller(5).multiply(2)));
        assertFalse(Money.doller(9).equals(Money.doller(5).multiply(2)));
    }

}
