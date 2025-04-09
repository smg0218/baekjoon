import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int value = Integer.parseInt(st.nextToken());
        int min = value;
        int max = value;


        for(int i = 1; i < length; i++) {
            value = Integer.parseInt(st.nextToken());
            if(value < min) min = value;
            if(value > max) max = value;
        }

        System.out.println(min + " " + max);
    }
}