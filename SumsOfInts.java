public class SumsAlgorithm {
    public static void main(String args[]) {
        System.out.println("Hello");
        int[] nums = { 2, 3, 6, 8, 5, 9, 14 };
        int sum = 17;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == sum) {
                    System.out.println(Integer.toString(nums[i]) + " + " + Integer.toString(nums[j]) + " = " + sum);

                }
            }
        }
    }
}
