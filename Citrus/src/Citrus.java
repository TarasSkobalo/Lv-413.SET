import java.io.IOException;
import java.io.Serializable;
import java.util.InputMismatchException;

public class Citrus extends Fruit implements Serializable {

    private double vitaminC;

    public Citrus() {
    }

    public Citrus(String name, String color, double vitaminC) {
        super(name, color);
        this.vitaminC = vitaminC;
    }

    public double getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(double vitaminC) {
        this.vitaminC = vitaminC;
    }

    @Override
    public String toString() {

        return "\nCitrus name: " + getName() + " Color: " + getColor() + " Vitamin C: " + getVitaminC() + " mg";

    }

    @Override
    public Fruit input() throws IOException {
        super.input();
        try {
            System.out.println("Enter quantity of vitamin C");
            setVitaminC(Double.parseDouble(br.readLine()));
        } catch (InputMismatchException e) {
            System.err.println("PLS...Enter digits");
        }
        return new Fruit();
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
