package checkPrime;

public class CheckPrime {
    public static void main(String[] args) {
        int number = 1000;
        for (int i = 0; i < number; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i < number; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
