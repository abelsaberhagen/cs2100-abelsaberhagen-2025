package sumofints;


public class SumsOfInts {
    public static void main(String args[]) {
        int[] nums = { 2, 3, 6, 8, 5, 9, 14 };
        int sum = 17;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == sum && nums[i] != nums[j]) {
                    System.out.println(nums[i] + " + " + nums[j] + " = " + sum);
                }
            }
        }
    }
}
