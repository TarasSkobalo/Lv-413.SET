import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class General {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        ArrayList<Fruit> fruitsList = new ArrayList<>();
        Fruit fruit = new Fruit();
        Fruit citrus = new Citrus();

        fruitsList.add(new Fruit("Apple", "green"));
        fruitsList.add(new Fruit("Pineapple", "yellow"));
        fruitsList.add(new Fruit("Grapefruit", "red"));
        fruitsList.add(new Citrus("Lemon", "yellow", 25));
        fruitsList.add(new Citrus("Grapefruit", "red", 52));

        fruit.input();
        fruitsList.add(fruit);
        citrus.input();
        fruitsList.add(citrus);

        System.out.println("List objects fruits and citrus");
        Fruit.serialization(fruitsList);
        Fruit.deSerialization();

        System.out.println(" ");
        System.out.println("\nSorting fruits by name: ");
        SortByName.sortFruitByName(fruitsList);
        for (Fruit f : fruitsList) {
            System.out.print(f.toString());
        }
        System.out.println(" ");
        System.out.println("\nEnter color which you want to see:");
        String color = br.readLine();
        List<Fruit> listFruitsByColor = FindByColor.fruitsByColor(fruitsList, color);
        for (Fruit f : listFruitsByColor) {
            f.print();
        }
    }
}
