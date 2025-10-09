import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int k = 4;
        if (a == b || a == c || a == d) k--;
        if (b == c || b == d) k--;
        if (c == d) k--;
        out.println(k);
    }
}
