import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken().toUpperCase();
        ArrayList<String> strList = new ArrayList<>();
        String keyword = null;
        int count = 0;
        boolean equals = false;

        for (int i = 0; i < str.length(); i++) {
            strList.add(str.substring(i, i+1));
        }

        Set<String> strSet = new HashSet<>(strList);
        for(String s : strSet) {
            int strCount = Collections.frequency(strList, s);
            if(strCount > count) {
                count = strCount;
                keyword = s;
                equals = false;
            } else if(strCount == count) {
                equals = true;
            }
        }

        if(equals)
            System.out.println("?");
        else
            System.out.println(keyword);
    }
}