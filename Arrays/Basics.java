import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int n = 5;
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Reverse using loop :- ");
        for(int i=n-1 ; i>=0 ; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // 2nd way to reverse an array
        int s = 0;
        int e = n-1;
        while(s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        System.out.print("Using two pointer:- ");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}