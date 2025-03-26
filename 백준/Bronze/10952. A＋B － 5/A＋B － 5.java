import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int a = 0;
        int b = 0;

        while(true) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            if(a == 0) break;
            b = Integer.parseInt(st.nextToken());
            System.out.println(a+b);
        }

    }
}