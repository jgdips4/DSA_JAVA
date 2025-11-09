public class FibanacciSeries {

    public static int fib(int n) {
        if (n <= 1) return n;

        int p1 = 1, p2 = 0, answer = 0;

        for (int i = 2; i <= n; i++) {
            answer = p1 + p2;
            p2 = p1;
            p1 = answer;
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 6; 
        System.out.println(fib(n));
    }
}