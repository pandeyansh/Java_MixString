public class Question2 {
    public static String repeatEnd(String str, int n) {
        int strLen = str.length();
        if (n <= 0) {
            return "";
        } else if (n >= strLen) {
            return str.repeat(n);
        } else {
            String end = str.substring(strLen - n);
            return end.repeat(n);
        }
    }
    public static void main(String[] args) {
        System.out.println(repeatEnd("Hello", 3));  
        System.out.println(repeatEnd("Hello", 2));  
        System.out.println(repeatEnd("Hello", 1));  
    }
}