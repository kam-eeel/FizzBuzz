package lab1;

public class Multiples {
    static void main() {
        System.out.println(multiples(1000, 3, 5));
    }

    static int multiples(int n, int a, int b) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            boolean multThree = i % a == 0;
            boolean multFive = i % b == 0;

            if (multThree) {
                count++;
            } else if (multFive) {
                count++;
            }
        }
        return count;
    }

    static int multiples() {
        return multiples(1000, 3, 5);
    }
}
