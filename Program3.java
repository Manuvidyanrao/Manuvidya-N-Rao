// Program3.java
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        int limit = x % 2 == 0 ? x - 1 : x;
        for (int i = 1; i <= limit; i += 2) {
            System.out.print(i);
            if (i < limit - 1)
                System.out.print(", ");
        }
    }
}
