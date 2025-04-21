import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == b && b == c) {
                if (a == 0)
                    break;
                else
                    System.out.println("Equilateral");
            } else if (a == b || b == c || c == a) {
                if ((a + b > c && (a <= c && b <= c)) || (b + c > a && (b <= a && c <= a)) || (c + a > b && (c <= b && a <= b)))
                    System.out.println("Isosceles");
                else
                    System.out.println("Invalid");
            } else if ((a + b > c && (a < c && b < c)) || (b + c > a && (b < a && c < a)) || (c + a > b && (c < b && a < b))) {
                System.out.println("Scalene");
            } else
                System.out.println("Invalid");
        }
    }
}