package factorial;

public class Factorial {
    public static void main(String[] args) {
        //System.out.println(factorialValue(Integer.parseInt(args[0])));
        System.out.println(factorialRecursive(Integer.parseInt(args[0])));
    }

    public static int factorialValue(int x) {
        int product = x;
        for (int i = x - 1; i > 0; i--) {
            product = product * i;
        }
        return product; 
    }

    public static int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return n * factorialRecursive(n - 1);
    }
}
