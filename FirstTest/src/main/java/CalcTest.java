import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {

    private Calc calc = new Calc();

    @Test
    public void testSum() throws Exception {
        Assert.assertEquals(5, calc.sum(2,3));
    }

    @Test
    public void testMinus() throws Exception {
        Assert.assertEquals(5, calc.minus(2,3));
    }

    @Test
    public void testDiv() throws Exception {
        Assert.assertEquals(5, calc.div(2,0));
    }

    @Test
    public void testMult() throws Exception {
        Assert.assertEquals(5, calc.mult(2,3));
    }
}
