// Only used in sorted array 
// TC -> O(log N)
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 22;
        int ans = searchBinary(arr , target );
        System.out.println(ans);
    }
    static int searchBinary(int[] arr , int target) {
        int s = 0;
        int e = arr.length-1;
        while(s <= e) {
            int mid = s + (e-s)/2;
            if(target < arr[mid]) {  // left
                e = mid - 1;
            }
            else if(target > arr[mid]) { // right
                s = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
