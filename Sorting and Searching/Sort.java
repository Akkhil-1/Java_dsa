public class Sort {
    public static void main(String[] args) {
        int[] arr = {8,5,6,1,2,7};
        int n = arr.length;
        heapSort(arr, n);
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void heapSort(int[] arr , int n) {
        for(int i=(n/2)-1 ; i>=0 ; i--) {
            heapify(arr , n , i);
        }
        for(int i=n-1 ; i>0 ; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }
    static void heapify(int[] arr , int n , int i) {
        int left = 2*i+1;
        int right = 2*i+2;
        int lar = i;
        if(left < n && arr[left] > arr[lar]) {
            lar = left;
        }
        if(right < n && arr[right] > arr[lar]) {
            lar = right;
        }
        if(lar != i) {
            swap(arr, i, lar);
            heapify(arr, n, lar);
        }
    }
    static void swap(int[] arr , int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
