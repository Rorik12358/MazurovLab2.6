package example.testpack;

import com.brainacad.carpack.Car;
import example.applepack.Apple;

/**
 * Created by R2-D2 on 25.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(77.17);
        Apple apple = new Apple(0.987);
        apple.setMass(0.071);
        System.out.println(apple.getMass());
        System.out.println(car1.getMass());
    }
}
