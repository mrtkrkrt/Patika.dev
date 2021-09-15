public class Main {

    public static boolean isPalindrome(String str){
        String reverse = getReverse(str);
        if (reverse.equals(str)) return true;
        return false;
    }

    public static String getReverse(String word){
        String reverse = "";
        for (int i = word.length()-1, j = 0; i >= 0; i--, j++) {
            reverse += word.charAt(i);
        }
        System.out.println(reverse);
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
    }
}
