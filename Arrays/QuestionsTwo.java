public class QuestionsTwo {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr1 = {1,0,1,5,0,2,0};
        int[] arr2 = {1,0,2,2,0,1,1,0,2,0,0,1};
        int[] arr3 = {1,1,2,2,3,3};
        int[] arr4 = {1,2,4,5};
        int[] arr5 = {1,1,0,0,1,1,1,0,0,1,1};
        int[] arr6 = {1,1,2,2,3,4,4,5,5};
        int n = arr.length;
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n3 = arr3.length;
        int n4 = arr4.length;
        int n5 = arr5.length;
        int n6 = arr6.length;
        int k = 2;
        rotate(arr , k , n);
        moveZeros(arr1,n1);
        sortZeroOneTwo(arr2, n2);
        int ans = removeDuplicates(arr3, n3);
        int ans1 = missingNumbr(arr4, n4);
        int ans2 = maximumOnes(arr5 , n5);
        int ans3 = numAppearOnce(arr6 , n6);
        System.out.println(ans3);
    }
    static void rotate(int[] arr , int k, int n) {
        k = k%n;
        reverse(arr , 0 , n-k-1);
        reverse(arr , n-k , n-1);
        reverse(arr , 0 , n-1);
    }
    static void reverse(int[] arr , int i , int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void moveZeros(int[] arr,int n) {
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0) {
                arr[j] = arr[i];
                j++;
            }
        }
        for(int i=j;i<n;i++) {
            arr[i] = 0;
        }
    }
    static void sortZeroOneTwo(int[] arr , int n) {
        int cnt0 = 0;
        int cnt1 = 0;
        @SuppressWarnings("unused")
        int cnt2 = 0;
        for(int i=0;i<n;i++){
            switch (arr[i]) {
                case 0 -> cnt0++;
                case 1 -> cnt1++;
                default -> cnt2++;
            }
        }
        for(int i=0;i<cnt0;i++){
            arr[i] = 0;
        }
        for(int i=cnt0;i<cnt0+cnt1;i++){
            arr[i] = 1;
        }
        for(int i=cnt0+cnt1;i<n;i++){
            arr[i] = 2;
        }
    }
    static int removeDuplicates(int[] arr , int n) {
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[j]!=arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return(i+1);
    }
    static int missingNumbr(int[] arr , int n) {
        int sum = (n*(n+1))/2;
        int sum1 = 0;
        for(int i=0;i<n-1;i++){
            sum1 += arr[i];
        }
        int missingNum = sum - sum1;
        return missingNum;
    }
    static int maximumOnes(int[] arr , int n) {
        int max = 0;
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == 1){
                cnt++;
                max = Math.max(max, cnt);
            }
            else {
                cnt = 0;
            }
        }
        return max;
    }
    static int numAppearOnce(int[] arr , int n){
        int xor = 0;
        for(int i=0;i<n;i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }
}
