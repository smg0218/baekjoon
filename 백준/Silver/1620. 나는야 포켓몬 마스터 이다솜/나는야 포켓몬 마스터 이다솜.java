import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int pkNum = Integer.parseInt(st.nextToken());
        int ansNum = Integer.parseInt(st.nextToken());
        Map<String, Integer> stringMap = new HashMap<>();
        Map<Integer, String> intMap = new HashMap<>();
        for(int i = 1; i <= pkNum; i++) {
            String str = br.readLine();
            stringMap.put(str, i);
            intMap.put(i, str);
        }

        for(int i = 0; i < ansNum; i++) {
            String readLine = br.readLine();
            if(isNumberic(readLine))
                bw.write(intMap.get(Integer.parseInt(readLine)) + "\n");
            else
                bw.write(stringMap.get(readLine) + "\n");

        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static boolean isNumberic(String str) {
        return str.chars().allMatch(Character::isDigit);
    }
}