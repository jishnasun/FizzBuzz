/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        //for (int i = 1; i < 100; i++) {
            // for loop: i is an integer that equals 1, and increases by 1 each iteration

        int i = 1;

        while (i < 100) {

            // Find out which numbers divide i.
            doFizzBuzz(i);

            i++;

        }
    }

    private static void doFizzBuzz(int i) {
        boolean divisibleBy3 = i % 3 == 0;  // seem to define what type of object the variable
        boolean divisibleBy5 = i % 5 == 0;  // has before variable name in order to define it

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {  // {&&} is the equivalent of {and}

            System.out.println("Fizz Buzz"); // all lines (i.e. functions calls) end with semicolon

        } else if (divisibleBy3) {  // opening and closing brackets instead of merely indenting

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
    }
}
