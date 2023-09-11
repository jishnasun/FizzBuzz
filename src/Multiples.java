public class Multiples {
    public static void main(int under) {
        int result = 0;

        for (int i = 1; i < under; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 || divisibleBy5) {
                result++;
            }
        }
        System.out.println(result);
    }
}
