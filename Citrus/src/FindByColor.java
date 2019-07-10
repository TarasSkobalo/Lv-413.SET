import java.util.ArrayList;

public class FindByColor {

    public static ArrayList<Fruit> fruitsByColor(ArrayList<Fruit> fruits, String color) {

        ArrayList<Fruit> newFruitsList = new ArrayList<>();

        for (Fruit fruit : fruits) {
            if (fruit.getColor().equals(color.toLowerCase())) {
                newFruitsList.add(fruit);
            }
        }
        return newFruitsList;
    }
}
