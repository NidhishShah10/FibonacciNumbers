public class FibonacciNumbers {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Please provide exactly one integer argument as the number of terms.");
            System.exit(1);
        }

        try {
            int n = Integer.parseInt(args[0]);
            if (n < 0) {
                System.err.println("Number of terms must be non-negative.");
                System.exit(1);
            }

            // Use efficient iterative approach instead of recursion
            int first = 0, second = 1;
            System.out.println("Fibonacci Series up to " + n + " terms:");
            for (int i = 0; i < n; i++) {
                System.out.print(first + " ");
                int next = first + second;
                first = second;
                second = next;
            }
        } catch (NumberFormatException e) {
            System.err.println("Invalid argument: " + e.getMessage());
            System.exit(1);
        }
    }
}

