package findminmax;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class FindMinMax {
    
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int numberOfNums = Integer.parseInt(args[0]);
        String[] numsAdded = new String[numberOfNums];

        System.out.println("Add " + numberOfNums + " numbers to the array.");

        for (int i = 0; i < numsAdded.length; i++) {
            System.out.println("Add a number.");
            String str = s.nextLine();
            numsAdded[i] = str;
        }

        int[] n = new int[numberOfNums];
        for (int i = 0; i < numberOfNums; i++) {
            n[i] = Integer.parseInt(numsAdded[i]);
        }
        minMax(n);
    }
    
    public static void minMax (int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("The largest number is " + max);
        System.out.println("The smallest number is " + min);
    }
}

