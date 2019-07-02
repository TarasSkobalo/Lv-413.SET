import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

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

        fruit.input(fruitsList);
        fruit.output();

        System.out.println("\nSorting fruits by name: ");
        Collections.sort(fruitsList, Fruit.fruitComparator);
        for (Fruit str : fruitsList) {
            System.out.print(str);
        }

        System.out.println("\nEnter color which you want to see:");
        String color = br.readLine();
        List<Fruit> listFruitsByColor = fruit.fruitsByColor(fruitsList, color);
        for (Fruit f : listFruitsByColor) {
            f.print();
        }
    }
}
