public class Basics {
    public static void main(String[] args) {
        String str = "noon";
        String str1 = "HelloWorld";
        String[] fruit = {"apple" , "mango" , "banana"};
        String str2 = "hi, i am akhil";
        String str3 = "aaabbcccdd";
        System.out.println("Check palindrome " + checkPalindrome(str));
        System.out.println("SubString " + substring(str1 , 0 , 5));
        // alternate
        System.out.println("Using function " + str1.substring(0,5));
        System.out.println("Largest string " + largest(fruit));
        System.out.println("New String " + capatilizeFirst(str2));
        System.out.println("Compreesed string " + compressStr(str3));
    }
    static boolean checkPalindrome(String str) {
        int n = str.length();
        for(int i=0;i<n/2;i++) {
            if(str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
    static String substring(String str , int si, int ei) {
        String substr = "";
        for(int i=si ; i<ei ; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    static String largest(String[] arr) {
        String largest = arr[0];
        for(int i=0;i<arr.length;i++) {
            if(largest.compareTo(arr[i]) < 0) {
                largest = arr[i];
            }
        }
        return largest;
    }
    static String capatilizeFirst(String str) {
        String[] words = str.split(" ");
        for(int i=0;i<words.length;i++) {
            String word = words[i];
            words[i] = capital(word);
        }
        return String.join(" " , words);
    }
    static String capital(String s) {
        char[] ch = s.toCharArray();
        ch[0] = (char)(ch[0]-32);
        return new String(ch);
    }
    static String compressStr(String str) {
        String newStr = "";
        for(int i=0;i<str.length();i++) {
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }
}
