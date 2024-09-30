public class Homework_2 {
    public static void main(String[] args) {

        //2 fibonacci
        int n = 12;
        System.out.println(fibonacci(n));
        System.out.println(degree(5,3));
        System.out.println(isPal("appa"));
        System.out.println(sum(17));



        //3 factorial
        int n1 = 6;
        System.out.println(factorial(n1));
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int nfib = fibonacci(n - 1) + fibonacci(n - 2);
        return nfib;
    }
    public static int factorial(int n1) {
        if (n1 <= 1) {
            return n1;
        }
        int fact = n1 * factorial(n1 -1);
        return fact;
    }

    public  static int degree(int p, int k) {
        if (k == 0)
            return 1;
        else return p * degree(p, k - 1);

    }
    // 7. Palindrome
    public static boolean isPal(String s){
        if(s.length() == 0 || s.length() == 1)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
            return isPal(s.substring(1, s.length()-1));
        return false;
    }

    // 8.Sum of digits
    int n4 =15;
    public static int sum (int n4){
        if(n4==0)
            return n4;
        else
            return (n4 % 10 + sum(n4 / 10));
    }
}