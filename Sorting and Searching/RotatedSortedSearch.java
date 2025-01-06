public class RotatedSortedSearch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = search(arr, target);
        if (result != -1) {
            System.out.println("Target " + target + " found at index " + result);
        } else {
            System.out.println("Target " + target + " not found.");
        }
    }
    static int search(int[] arr , int target) {
        int s = 0;
        int e = arr.length-1;
        while(s <= e) {
            int mid = s + (e-s)/2;
            if(arr[mid] == target) {
                return mid;
            }
            // target is greater than start and less than mid
            if(arr[s] <= arr[mid]) {
                if(arr[s] <= target && arr[mid] > target) {
                    e = mid-1;
                }
                else {
                    s = mid+1;
                }
            }
            else {
                // target is greater than mid and less and end
                if(arr[mid] < target && arr[e] >= target) {
                    s = mid+1;
                }
                else{
                    e = mid-1;
                }
            }
        }
        return -1;
    }

}
