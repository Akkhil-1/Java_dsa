public class QuestionsOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        System.out.println("Largest " + largestEle(arr,n));
        System.out.println("Smallest " + smallestEle(arr,n));
        System.out.println("Sum " + sum(arr,n));
        System.out.println("Product " + product(arr, n));
        System.out.println("Second Lar " +secondLar(arr, n));
        System.out.println("Second Small " +secondSmall(arr, n));
        reverseArr(arr , n);
        System.out.println("Check if sorted " + checkSorted(arr , n));
    }
    static int largestEle(int[] arr,int n) {
        int lar = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            if(arr[i] > lar) {
                lar = arr[i];
            }
        }
        return lar;
    }
    static int smallestEle(int[] arr,int n) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    static int sum(int[] arr , int n) {
        int sum = 0;
        for(int i=0;i<n;i++) {
            sum+=arr[i];
        }
        return sum;
    }
    static int product(int[] arr , int n) {
        int pro = 1;
        for(int i=0;i<n;i++) {
            pro *= arr[i];
        }
        return pro;
    }
    static int secondLar(int[] arr , int n) {
        //  O(N)
        int lar = arr[0];
        int secondLar = -1;
        for(int i=0;i<n;i++) {
            if(arr[i] > lar) {
                secondLar = lar;
                lar = arr[i];
            }
            else if(arr[i] > secondLar && arr[i] < lar) {
                secondLar = arr[i];
            }
        }
        return secondLar;
    }
    static int secondSmall(int[] arr , int n) {
        //  O(N)
        int small = arr[0];
        int secondSmall = Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            if(arr[i] < small) {
                secondSmall = small;
                small = arr[i];
            }
            else if(arr[i] < secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }
        }
        return secondSmall;
    }
    static void reverseArr(int[] arr , int n) {
        int s = 0;
        int e = arr.length-1;
        while(s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    static boolean checkSorted(int[] arr , int n) {
        for(int i=1;i<n;){
            if(arr[i] >= arr[i-1]) {
                return true;
            }
            else{
                return true;
            }
        }
        return true;
    }

}

