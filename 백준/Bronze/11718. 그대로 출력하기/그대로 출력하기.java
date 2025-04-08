import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str;


        while ((str=br.readLine()) != null) {
            st = new StringTokenizer(str, "\n");
            String a = st.nextToken();
            System.out.println(a);
        }
    }
}