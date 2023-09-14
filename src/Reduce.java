public class Reduce {
    public static int main(int start) {
        int steps = 0;

        while (start != 0) {
            boolean even = start % 2 == 0;
            if (even) {
                start = start / 2;
            } else {
                start = start - 1;
            }
            steps++;
        }

        return steps;
    }
}
