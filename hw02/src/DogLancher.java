import org.dom4j.DocumentHelper;

import java.math.BigDecimal;

public class DogLancher {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog(100);
        dogs[1] = new Dog(20);
        Dog bigger = Dog.maxDog(dogs[0], dogs[1]);
        System.out.println(bigger.weightInPounds);
        System.out.println(Dog.binomen);
        bigger.makeNoise();

        Dog maya = new Dog(70);
        Dog shuo = new Dog(100);
        System.out.println(maya.maxDog(shuo).weightInPounds);

        Dog bestDog= Dog.maxDog(maya, shuo);
        System.out.println(bigger.weightInPounds);
    }
}
