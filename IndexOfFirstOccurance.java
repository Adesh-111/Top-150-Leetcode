public class Main {
    public static void main(String[] args) {
        String str = "sadandsad";
        String subStr = "and";
        System.out.println(indexOfFirstOccurance(str,subStr));
    }

    public static int indexOfFirstOccurance(String str, String subStr){
        int strlen = str.length();
        int subStrLen = subStr.length();
        if (subStrLen == 0) return 0;
        if (subStrLen > strlen) return -1;

        for(int i = 0; i< strlen - subStrLen; i++) {
            if (str.charAt(i) == subStr.charAt(0)) {
                int j = 1;
                while (j < subStrLen && str.charAt(i + j) == subStr.charAt(j)){
                    j++;
                    if(j == subStrLen){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
