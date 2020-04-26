import org.junit.Test;
import tdd.Chf;
import tdd.Dollar;
import tdd.Money;

import static org.junit.Assert.*;

/**
 * @author ：ls05
 * @date ：Created in 2020/4/25 19:51
 */
public class MoneyTest {
    @Test
    public void dollarTest(){
        Dollar five = (Dollar)Money.createMoney(5,Money.currencyEnum.USD);
        Dollar ten =  (Dollar)five.multiply(2);
        assertTrue(ten.equals(new Dollar(10)));
    }
    @Test
    public void chfTest(){
        Chf five = (Chf) Money.createMoney(5, Money.currencyEnum.CHF);
        Chf ten =  (Chf)five.multiply(2);
        assertTrue(ten.equals(new Chf(10)));
    }
    @Test
    public void equalsTest(){
        Chf five = (Chf) Money.createMoney(5, Money.currencyEnum.CHF);
        Chf ten =  (Chf)five.multiply(2);
        Dollar dollar10 = (Dollar)Money.createMoney(10, Money.currencyEnum.USD);
        assertFalse(dollar10.equals(new Chf(10)));
    }
}
