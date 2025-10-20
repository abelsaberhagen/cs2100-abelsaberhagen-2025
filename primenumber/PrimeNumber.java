package primenumber;
import java.util.Arrays;

public class PrimeNumber {
    public static void main(String args[]) {
        int num = Integer.parseInt(args[0]);
        System.out.println(findFactors(num));
    }
    public static String findFactors(int x) {
        int[] factors = new int[100];
        int index = 0;
        for (int i = 2; i < x/2; i++) {
            if (x % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        //System.out.println(Arrays.toString(factors));
        if (factors[0] == 0) {
            return "This number is prime.";
        }
        else {
            return "This number has factors.";
        }
    }
}
