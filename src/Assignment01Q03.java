public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); // TODO: Read the first string argument (replace this line)
        System.out.println("The first " + x + " Fibonacci numbers are:");

        ////////////////////////////////////////////////////////////////
        // TODO: Replace this code with the correct Fibonacci sequence
        ////////////////////////////////////////////////////////////////
        /// ...
        
        int numOdd = 0;
        int fib1 = 1, fib2 = 1;
        for (int i = 0; i < x; i++) {
            System.out.print(fib1);
            if (fib1 % 2 != 0) {
                numOdd++;
            }
            if (i < x - 1)
                System.out.print(" "); // Make sure we don't print a trailing space
            int temp = fib1 + fib2;
            fib1 = fib2;
            fib2 = temp;
        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
