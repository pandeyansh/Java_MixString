import java.util.Arrays;
public class Question3 {
    public static int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex] = num;
                evenIndex++;
            } else {
                result[oddIndex] = num;
                oddIndex--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 1, 0, 0, 1, 1};
        int[] arr2 = {3, 3, 2};
        int[] arr3 = {2, 2, 2};
        int[] result1 = evenOdd(arr1);
        int[] result2 = evenOdd(arr2);
        int[] result3 = evenOdd(arr3);
        System.out.println(Arrays.toString(result1));  
        System.out.println(Arrays.toString(result2));  
        System.out.println(Arrays.toString(result3));
    }
}