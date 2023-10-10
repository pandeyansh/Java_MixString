public class Question1 {
    public static String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int minLength = Math.min(a.length(), b.length());
        for (int i = 0; i < minLength; i++) {
            result.append(a.charAt(i)).append(b.charAt(i));
        }
        result.append(a.substring(minLength));
        result.append(b.substring(minLength));
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));    
        System.out.println(mixString("Hi", "There"));  
        System.out.println(mixString("xxxx", "There"));
    }
}