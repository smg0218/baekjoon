import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int min = N;
        for (int i = 1; i <= N / 3; i++) {
            int nowNum = i * 3;
            if((N - nowNum) % 3 == 0) {
                if(min > i + ((N - nowNum) / 3))
                    min = i + ((N - nowNum) / 3);
            }
            if ((N - nowNum) % 5 == 0) {
                if (min > i + ((N - nowNum) / 5))
                    min = i + ((N - nowNum) / 5);
            }
        }

        for (int i = 1; i <= N / 5; i++) {
            int nowNum = i * 5;
            if((N - nowNum) % 5 == 0) {
                if(min > i + ((N - nowNum) / 5))
                    min = i + ((N - nowNum) / 5);
            }
            if ((N - nowNum) % 3 == 0) {
                if (min > i + ((N - nowNum) / 3))
                    min = i + ((N - nowNum) / 3);
            }
        }

        if (min == N)
            System.out.print(-1);
        else
            System.out.print(min);
    }
}