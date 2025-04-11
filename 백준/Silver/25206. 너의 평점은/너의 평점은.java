import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        float avg = 0.0f;
        float sum = 0.0f;


        for(int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            st.nextToken();
            float score = Float.parseFloat(st.nextToken());
            String grade = st.nextToken();
            switch (grade) {
                case "A+":
                    avg = (float) (avg + score * 4.5);
                    sum += score;
                    break;
                case "A0":
                    avg = (float) (avg + score * 4.0);
                    sum += score;
                    break;
                case "B+":
                    avg = (float) (avg + score * 3.5);
                    sum += score;
                    break;
                case "B0" :
                    avg = (float) (avg + score * 3.0);
                    sum += score;
                    break;
                case "C+":
                    avg = (float) (avg + score * 2.5);
                    sum += score;
                    break;
                case "C0":
                    avg = (float) (avg + score * 2.0);
                    sum += score;
                    break;
                case "D+":
                    avg = (float) (avg + score * 1.5);
                    sum += score;
                    break;
                case "D0":
                    avg = avg + score;
                    sum += score;
                    break;
                case "F":
                    avg = (float) (avg + score * 0.0);
                    sum += score;
            }
        }
        if(avg != 0.0)
            avg = avg / sum;

        System.out.printf(String.valueOf(avg));
    }
}