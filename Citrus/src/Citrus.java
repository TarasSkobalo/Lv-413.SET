import java.io.IOException;
import java.util.InputMismatchException;

public class Citrus extends Fruit {

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
    public Fruit input() throws IOException {
        super.input();
        try {
            System.out.println("Enter quantity of vitamin C");
            setVitaminC(Integer.parseInt(br.readLine()));
        }catch (InputMismatchException e) {
            System.err.println("PLS...Enter digits");
        }
        return new Fruit();
    }

    @Override
    public String print(Fruit citrus) {
        return citrus.print(citrus);
    }
}
