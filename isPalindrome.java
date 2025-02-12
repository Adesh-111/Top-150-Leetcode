public class Main {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
       System.out.println(isPalindrome(s)); 
    }

    public static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            while(!Character.isLetterOrDigit(str.charAt(start))) start++;
            while(!Character.isLetterOrDigit(str.charAt(end))) end--;
            if(Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
