public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0;
        int sum = 0;
        while(x < 10) {
            System.out.println(sum);
            x = x + 1;
            sum += x;
        }
        String h = 5 + "horse";
        System.out.println(h);

//        int h2 = 5 + "horse";
//        System.out.println(h2);

        System.out.println(5 + "10");
        System.out.println(5 + 10);
    }
}
