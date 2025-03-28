import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int count = T;
        int star = 1;

        for(int i = 1; i <= T; i++) {
            count--;
            for(int j = 0; j < count; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < star; j++) {
                System.out.print("*");
            }
            star += 2;
            System.out.println();
        }
        for(int i = T; i >= 0; i--) {
            for(int j = 0; j <= count; j++) {
                if(i == T) continue;
                System.out.print(" ");
            }
            star -= 2;
            for(int j = 0; j < star; j++) {
                if(i == T) continue;
                System.out.print("*");
            }
            if(i != T) {
                count++;
                System.out.println();
            }
        }
    }
}