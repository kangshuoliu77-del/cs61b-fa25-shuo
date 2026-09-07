public class LagerNumber {
    /** Returns the lager of x and y.*/
    public static int lager(int x, int y) {
        if(x > y) {
            return x;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(lager(-5, 10));
    }
}
