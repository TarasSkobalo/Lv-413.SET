import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByName implements Comparator<Fruit> {

    @Override
    public int compare(Fruit s1, Fruit s2) {
        String fruit1 = s1.getName().toUpperCase();
        String fruit2 = s2.getName().toUpperCase();

        return fruit1.compareTo(fruit2);
    }

    public static ArrayList<Fruit> sortFruitByName(ArrayList<Fruit> fruits) {
        Collections.sort(fruits, new SortByName());
        return fruits;
    }
}
