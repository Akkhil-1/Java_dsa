import java.util.Arrays;
public class QuestionsOne {
    public static void main(String[] args) {
        String str = "hello";
        String str1 = "madam";
        String str2 = "swiss";
        String str3 = "123a45";
        String str4 = "this is test string";
        String s = "akhil";
        String s1 = "listen";
        String s2 = "silent";
        System.out.println("Reverse string is " + reverseStr(str));
        System.out.println("Check palindrome " + checkPalindrome(str1));
        System.out.println("Two strings are anagram " + isAnagram(s1, s2));
        System.out.println("Two strings are anagram " + AlternateisAnagram(str, str1));
        System.out.println("First Non-repeatint character " + firstNonChar(str2));
        System.out.println("Only Digits " + checkIfContainsDigit(str3));
        System.out.println("Sub String found or not " + subStringSearch(str4, s));
    }

    static String reverseStr(String str) {
        char[] ch = str.toCharArray();
        int s = 0;
        int e = ch.length-1;
        while (s < e) {
            char temp = ch[s];
            ch[s] = ch[e];
            ch[e] = temp;
            s++;
            e--;
        }
        return new String(ch); // to convert char into string
    }
    static boolean checkPalindrome(String str) {
        int n = str.length();
        for(int i=0 ; i<n/2 ; i++) {
            if(str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
    static String isAnagram(String s1 , String s2) {
        if(s1.length() != s2.length()) {
            return "No";
        }
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1, ch2)) {
            return "Yes";
        }
        return "No";
    }
    static String AlternateisAnagram(String s1 , String s2) {
        if(s1.length() != s2.length()) {
            return "No";
        }
        int[] count = new int[256];
        for(int i=0;i<s1.length();i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i=0;i<256;i++) {
            if(count[i] != 0) {
                return "No";
            }
        }
        return "Yes";
    }
    static char firstNonChar(String str) {
        int[] count = new int[256];
        for(int i=0;i<str.length();i++) {
            count[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++) {
            if(count[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return ' ';
    }
    static String checkIfContainsDigit(String str) {
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++) {
            if(ch[i] < '0' || ch[i] > '9') {
                return "No";
            }
        }
        return "Yes";
    }
    static String subStringSearch(String str , String s) {
        String[] words = str.split( " ");
        for(int i=0;i<words.length;i++) {
            if(words[i].equals(s)) {
                return "Yes";
            }
        }
        return "No";
    }
}
