public class Main {
    public static void main(String[] args) {
        int number = 10;

        System.out.println("The " + number + "th term of the Fibonacci sequence is: " + calculateFibDynamic(number));
    }

    private static int calculateFibDynamic(int n) {
        if (n <= 1) {
            return n;
        }
        return calculateFibDynamic(n - 1) + calculateFibDynamic(n - 2);
    }
}