import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int limit = x % 2 == 0 ? x - 1 : x;
        for (int i = 1; i <= limit; i += 2) {
            System.out.print(i + (i + 2 <= limit ? ", " : ""));
        }
    }
}