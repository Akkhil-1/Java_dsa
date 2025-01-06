// fibonacci , armstrong and palindrome , prime
public class ExtraQuestions {
    public static void main(String[] args) {
        int n = 17;
        int n1 = 153;
        int n2 = 10;
        int n3 = 123    ;
        System.out.println("Check prime " + checkPrime(n));
        if(checkArmstrong(n1)) {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        fibonacci(n2);
        System.out.println();
        int ans = nthfibonacci(n2);
        System.out.println(ans);
        System.out.println("Palindrome " + palindrome(n3));
    }
    static boolean checkPrime(int n) {
        if(n <= 1) return false;
        for(int i=2 ; i*i <= n ; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    static boolean checkArmstrong(int n) {
        int originalValue = n;
        int sum = 0;
        int count = 0;
        int temp = n;
        while(temp != 0) {
            temp = temp / 10;
            count++;
        }
        while(n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum += Math.pow(rem, count);
        }
        return sum == originalValue;
    }
    static void fibonacci(int n) {
        int first = 0 , second = 1;
        for(int i=0;i<n;i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
    static int nthfibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int first = 0 , second = 1;
        for(int i=2;i<=n;i++) {
            int next = first + second;
            first = second;
            second = next;
        }
        return second;
    }
    static boolean palindrome(int n) {
        int originalNum = n;
        int reverse = 0;
        while(n != 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }
        return originalNum == reverse;
    }
}
