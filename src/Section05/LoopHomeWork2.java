package Section05;

public class LoopHomeWork2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i += 3) {
            for (int j = 1; j <= 9; j++) {
                for (int k = i; k < i + 3; k++) {
                    System.out.printf("%d x %d = %2d\t", k, j, k * j);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}