public class Main {
    public static void main(String[] args) {
        int number = 10;

        System.out.println("The " + number + "th term of the Fibonacci sequence is: " + calculateFibDynamic(number));
    }

    /**
     * Calculates the nth Fibonacci number using a recursive approach.
     * The Fibonacci sequence is defined as:
     *  F(0) = 0, F(1) = 1, and F(n) = F(n - 1) + F(n - 2) for n > 1.
     *
     * @param n the index of the Fibonacci number to calculate (must be >= 0)
     * @return the nth Fibonacci number
     */
    private static int calculateFibDynamic(int n) {
        if (n <= 1) {
            return n;
        }
        return calculateFibDynamic(n - 1) + calculateFibDynamic(n - 2);
    }
}