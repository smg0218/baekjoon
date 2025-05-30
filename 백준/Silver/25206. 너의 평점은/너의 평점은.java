import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double avg = 0.0;
        double sum = 0.0;

        for(int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            if(!grade.equals("P")) {
                sum += score;
                switch (grade) {
                    case "A+":
                        avg = avg + score * 4.5;
                        break;
                    case "A0":
                        avg = avg + score * 4.0;
                        break;
                    case "B+":
                        avg = avg + score * 3.5;
                        break;
                    case "B0":
                        avg = avg + score * 3.0;
                        break;
                    case "C+":
                        avg = avg + score * 2.5;
                        break;
                    case "C0":
                        avg = avg + score * 2.0;
                        break;
                    case "D+":
                        avg = avg + score * 1.5;
                        break;
                    case "D0":
                        avg = avg + score;
                        break;
                    case "F":
                        avg = avg + score * 0.0;
                }
            }
        }

        System.out.println(avg == 0.0 ? avg : avg / sum);
    }
}