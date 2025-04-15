import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String[][] strList = new String[5][15];
        for(int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            for(int j = 0; j < s.length(); j++) {
                strList[i][j] = s.substring(j, j+1);
            }
        }

        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 5; j++) {
                if(strList[j][i] != null)
                    System.out.print(strList[j][i]);
            }
        }
    }
}