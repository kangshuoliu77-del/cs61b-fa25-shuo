public class Dog {
//    public static void makeNoise() {
//        System.out.println("Bark");
//    }

    public int weight;

    public Dog(int w) {
        weight = w;
    }

    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.weight > d2.weight) {
            return d1;
        }
        return d2;
    }

    public Dog maxDog(Dog d2) {
        if (this.weight > d2.weight) {
            return this;
        }
        return d2;
    }

    public void makeNoise() {
        if (weight < 10) {
            System.out.println("yipyip");
        } else if (weight < 30) {
            System.out.println("barkbark");
        } else {
            System.out.println("woofffffff");
        }
    }
}
