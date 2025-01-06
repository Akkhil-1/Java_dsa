import java.util.*;
public class LongestSeq {
    public static void main(String[] args) {
        int[] arr = {102,4,100,1,101,3,2,1,1};
        int n = arr.length;
        int ans = longestSub(arr, n);
        int ans1 = longest(arr, n);
        System.out.println(ans1);
        System.out.println(ans);
    }
    static int longestSub(int[] arr , int n) {
        int cnt = 0;
        int longest = 1;
        for(int i=0;i<n;i++) {
            int x = arr[i];
            cnt = 1;
            while(linearSearch(arr , x+1) == true) {
                x = x + 1;
                cnt = cnt + 1;
            }
            longest = Math.max(longest, cnt);
        }
        return cnt;
    }
    static boolean linearSearch(int []a, int num) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] == num)
                return true;
        }
        return false;
    }
    // optimal solution
    static int longest(int[] arr , int n) {
        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++) {
            set.add(arr[i]);
        }
        Integer[] setArray = new Integer[set.size()];
        set.toArray(setArray);
        for(int i=0;i<setArray.length;i++) {
            int num = setArray[i];
            if(!set.contains(num-1)) {
                int cnt = 1;
                int x = num;
                while(set.contains(x+1)) {
                    cnt = cnt + 1;
                    x = x +1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}
