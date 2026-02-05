public class Dog {

    public int weightInPounds;
    public static String binomen = "Canis";

    /* Constructer */
    public Dog(int wight){
        weightInPounds = wight;
    }

    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.weightInPounds > d2.weightInPounds) {
            return d1;
        }
        return d2;
    }

    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yip yip");
        } else if (weightInPounds < 30) {
            System.out.println("bark");
        } else System.out.println("arooooooo!");
    }

    public Dog maxDog(Dog otherDog) {
        if (this.weightInPounds > otherDog.weightInPounds) {
            return this;
        }
        return otherDog;
    }

}
