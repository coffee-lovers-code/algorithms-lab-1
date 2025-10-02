import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        int k = 4;
        if (a == b || a == c || a == d) k--;
        if (b == c || b == d) k--;
        if (c == d) k--;
        out.println(k);
    }
}
