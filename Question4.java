public class Question4 {
    public static boolean only14(int[] nums) {
        for (int num : nums) {
            if (num != 1 && num != 4) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 1, 4};
        int[] arr2 = {1, 4, 2, 4};
        int[] arr3 = {1, 1};
        System.out.println(only14(arr1)); 
        System.out.println(only14(arr2)); 
        System.out.println(only14(arr3)); 
    }
}