import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] intList = new int[Integer.parseInt(st.nextToken())];
        st = new StringTokenizer(br.readLine(), " ");


        for(int i = 0; i < intList.length; i++) {
            intList[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(intList);

        System.out.println(intList[0] + " " + intList[intList.length - 1]);
    }
}