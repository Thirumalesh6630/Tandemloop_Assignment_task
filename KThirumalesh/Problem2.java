import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.print((2 * i + 1) + (i < x - 1 ? ", " : ""));
        }
    }
}