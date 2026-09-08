public class DogLauncher {
    public static void main(String[] args) {
        Dog d;
        d = new Dog(40);
//        d.weight = 20;
        d.makeNoise();

        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog(2);
        dogs[1] = new Dog(100);

        dogs[0].makeNoise();
        dogs[1].makeNoise();

        System.out.println();


        Dog d1 = new Dog(100);
        Dog d2 = new Dog(5);
        Dog d3 = new Dog(15);

        Dog.maxDog(d1, d2).makeNoise();

        d2.maxDog(d3).makeNoise();
    }
}
