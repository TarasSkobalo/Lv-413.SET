import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Fruit> fruitsss = new ArrayList<>();
        fruitsss.add(new Fruit("Pineapple", "yellow"));
        fruitsss.add(new Fruit("Dragon fruit", "red"));
        fruitsss.add(new Fruit("Grape", "blue"));

        Fruit fruit = new Fruit();
        fruit.input();
        fruit.print(fruit);
        System.out.println(fruitsss);

//        System.out.println("Sorting fruits by name: ");
//        Collections.sort(fruits, Fruit.fruitComparator);
//        for (Fruit str : fruits) {
//            System.out.println(str);
//        }
    }
}
