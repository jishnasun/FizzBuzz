public class Multiples {
    public static int main(int under) {
        int result = 0;

        for (int i = 1; i < under; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 || divisibleBy5) {
                result++;
            }
        }
        return result;
    }

    public static int main(int a, int b, int n) {
        int result = 0;

        for (int i = 1; i < n; i++) {
            boolean divisibleByA = i % a == 0;
            boolean divisibleByB = i % b == 0;

            if (divisibleByA || divisibleByB) {
                result++;
            }
        }
        return result;
    }
}
