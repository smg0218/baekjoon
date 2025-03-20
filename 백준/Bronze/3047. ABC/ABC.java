import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();

        while(true) {
            if (a > b) {
                int dif = a;
                a = b;
                b = dif;
            }
            if (b > c) {
                int dif = b;
                b = c;
                c = dif;
            }

            if(c > b && b > a)
                break;
        }

        for(int i = 0; i < 3; i++) {
            if(str.charAt(i) == 'A')
                System.out.print(a + " ");
            else if(str.charAt(i) == 'B')
                System.out.print(b + " ");
            else if(str.charAt(i) == 'C')
                System.out.print(c + " ");
        }

    }
}