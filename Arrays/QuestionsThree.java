import java.util.Arrays;
public class QuestionsThree {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int[] arr1 = {2, 2, 1, 1, 1, 2, 2};
        int[] arr2 = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int n1 = arr1.length;
        int n2 = arr2.length;
        int tar = 14;
        boolean ans = twoSum(arr, n, tar);
        int ans1 = countMajority(arr1 , n1);
        int ans2 = kadane(arr2 , n2);
        System.out.println(ans2);
    }
    static boolean twoSum(int[] arr , int n , int tar){
        Arrays.sort(arr);
        int left = 0 , right = n-1;
        while(left < right) {
            int sum = arr[left] + arr[right];
            if(sum == tar) {
                return true;
            }
            else if(sum < tar) left++;
            else right++;
        }
        return false;
    }
    static int countMajority(int[] arr , int n) {
        int cnt = 0;
        int ele=0;
        for(int i=0;i<n;i++) {
            if(cnt == 0) {
                cnt = 1;
                ele = arr[i];
            }
            else if(arr[i] == ele) {
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt1=0;
        for(int i=0;i<n;i++){
            if(arr[i] == ele) cnt1++;
        }
        if(cnt1 > (n/2)) return ele;
        return -1;
    }
    static int kadane(int[] arr , int n){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}
