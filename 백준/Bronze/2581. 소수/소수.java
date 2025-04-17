import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int startNum = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int endNum = Integer.parseInt(st.nextToken());
        int min = 10000;
        int sum = 0;

        if(startNum == 1 || startNum == 0)
            startNum = 2;

        for(int i = startNum; i <= endNum; i++) {
            boolean flag = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                sum+=i;
                if(min > i)
                    min = i;
            }
        }

        if(sum == 0)
            System.out.println(-1);
        else
            System.out.printf(sum + "\n" + min);
    }
}