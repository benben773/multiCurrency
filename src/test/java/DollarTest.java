import org.junit.Test;
import tdd.Chf;
import tdd.Dollar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author ：ls05
 * @date ：Created in 2020/4/25 19:51
 */
public class DollarTest {
    @Test
    public void dollarTest(){
        Dollar five = new Dollar(5);
        Dollar ten = five.multiply(2);
        assertTrue(ten.equals(new Dollar(10)));
    }
    @Test
    public void chfTest(){
        Chf five = new Chf(5);
        Chf ten = five.multiply(2);
        assertTrue(ten.equals(new Chf(10)));
    }
}
