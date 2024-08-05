import org.junit.Test;
import org.junit.Assert;

public class JUnit4Test {
    @Test
    public void test111() {
        CashBackHacker service = new CashBackHacker();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void test222() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test333() {
        CashBackHacker service = new CashBackHacker();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(expected, actual);

    }
}
