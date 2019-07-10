import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.*;

public class Fruit implements Serializable{

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
        return "\nFruit name: " + name + " Color: " + color;
    }

    public Fruit input() throws IOException {
        System.out.println("Enter name of fruit");
        setName(br.readLine());
        System.out.println("Enter fruit's color");
        setColor(br.readLine().toLowerCase());
        return new Fruit();
    }

    public void print() {
        System.out.print(this);
    }

    //   Serialized
    public static void serialization(ArrayList arrayList) throws IOException {
        FileOutputStream fos = new FileOutputStream("fruits.xml");
        XMLEncoder encoder = new XMLEncoder(fos);
        encoder.writeObject(arrayList);
        encoder.close();
        fos.close();
    }

    //  De-Serialized
    public static void deSerialization() {
        try (XMLDecoder xmlDecoder = new XMLDecoder(new FileInputStream("fruits.xml"))) {
            ArrayList<Fruit> arrayList = (ArrayList<Fruit>) xmlDecoder.readObject();
            System.out.printf(arrayList.toString());
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}
