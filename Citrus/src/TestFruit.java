import org.testng.Assert;
import org.testng.annotations.Test;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;

public class TestFruit {

    @Test
    public void getFruitsByColorTest() {
        //Arrange
        ArrayList<Fruit> testList = new ArrayList<>();
        ArrayList<Fruit> actual = new ArrayList<>();
        ArrayList<Fruit> expected;
        ArrayList<String> expectedColor = new ArrayList<>();
        ArrayList<String> actualColor = new ArrayList<>();

        testList.add(new Fruit("apple", "green"));
        testList.add(new Fruit("pineapple", "yellow"));
        testList.add(new Fruit("grape", "blue"));
        testList.add(new Fruit("banana", "yellow"));
        testList.add(new Fruit("grape", "blue"));

        actual.add(new Fruit("pineapple", "yellow"));
        actual.add(new Fruit("banana", "yellow"));
        //Act
        expected = FindByColor.fruitsByColor(testList, "yellow");
        for (Fruit f : expected) {
            expectedColor.add(f.getColor());
        }
        for (Fruit f : actual) {
            actualColor.add(f.getColor());
        }
        //Assert
        Assert.assertEquals(expectedColor, actualColor);
    }

    @Test
    public void sortFruitByNameTest() {
        ArrayList<String> expectedName = new ArrayList<>();
        ArrayList<String> actualName = new ArrayList<>();

        ArrayList<Fruit> fruits = new ArrayList<Fruit>();

        fruits.add(new Fruit("grape", "green"));
        fruits.add(new Fruit("mango", "red"));
        fruits.add(new Fruit("banana", "yellow"));


        ArrayList<Fruit> expected = new ArrayList<Fruit>();
        expected.add(new Fruit("grape", "green"));
        expected.add(new Fruit("banana", "yellow"));
        expected.add(new Fruit("mango", "red"));


        //Actual
        ArrayList<Fruit> actual = SortByName.sortFruitByName(expected);

        for (Fruit f : expected) {
            expectedName.add(f.getName());
        }
        for (Fruit f : actual) {
            actualName.add(f.getName());
        }
        //Assert
        Assert.assertEquals(expectedName, actualName);
    }
}
