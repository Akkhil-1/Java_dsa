public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10,25,3,5,18};
        int n = arr.length;
        int target = 3;
        int ans = linearSearch(arr , n , target);
        System.out.print(ans);
    } 
    static int linearSearch(int[] arr , int n , int target) {
        for(int i=0;i<n;i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
// Time complexity is O[N]