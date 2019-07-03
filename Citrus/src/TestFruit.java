import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.testng.AssertJUnit.assertEquals;

public class TestFruit {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    @Test
    public void inputTest() throws IOException {
//        Arrange

        Fruit actual = new Fruit();
        Fruit expected = new Fruit("Mango", "orange");

//        Act

        actual.setName("Mango");
        actual.setColor("orange");
        
//        Assert
        Assert.assertEquals(expected.getName(), actual.getName());
        Assert.assertEquals(expected.getColor(), actual.getColor());

    }
}
