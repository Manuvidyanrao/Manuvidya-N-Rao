// Program2.java
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.print((2 * i + 1));
            if (i != x - 1)
                System.out.print(", ");
        }
    }
}
