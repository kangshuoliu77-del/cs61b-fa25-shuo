public class PrimeChecker {
    public static boolean isPrime(int number) {
        if (number == 0) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        if (isPrime(1337)) {
            System.out.println("1337 is prime.");
        }
        else {
            System.out.println("1337 is not primte.");
        }
    }
}
