import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int count = T;

        for(int i = 1; i <= T; i++) {
            count--;
            for(int j = 0; j < count; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for(int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = T; i >= 0; i--) {
            for(int j = 0; j <= count; j++) {
                if(i == T) continue;
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                if(i == T) continue;
                System.out.print("*");
            }
            for(int j = 1; j < i; j++) {
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