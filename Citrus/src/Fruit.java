import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Fruit {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private String name;
    private String color;

    public Fruit() {
    }

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruit: " + name + " Color: " + color;
    }

    public Fruit input() throws IOException {
        System.out.println("Enter name of fruit");
        setName(br.readLine());
        System.out.println("Enter fruit's color");
        setColor(br.readLine());
        return new Fruit();
    }

    public String print(Fruit fruit) {
        return fruit.toString();
    }

    // Comparator by Name
    public static Comparator<Fruit> fruitComparator = new Comparator<Fruit>() {

        public int compare(Fruit s1, Fruit s2) {
            String FruitName1 = s1.getName().toUpperCase();
            String FruitName2 = s2.getName().toUpperCase();

            return FruitName1.compareTo(FruitName2);
        }
    };



}
