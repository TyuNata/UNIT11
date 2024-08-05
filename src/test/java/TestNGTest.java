import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTest {


    @Test
    public void test11() {
        CashBackHacker service = new CashBackHacker();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void test22() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void test33() {
        CashBackHacker service = new CashBackHacker();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);

    }
}
