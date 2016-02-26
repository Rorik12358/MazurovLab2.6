package example.applepack;

/**
 * Created by R2-D2 on 24.02.2016.
 */
public class Apple {
    private double weight;

    public double getMass() {
        return weight;
    }

    public void setMass(double weight) {
        this.weight = weight;
    }

    public Apple(double weight) {
        this.weight = weight;
    }
}
