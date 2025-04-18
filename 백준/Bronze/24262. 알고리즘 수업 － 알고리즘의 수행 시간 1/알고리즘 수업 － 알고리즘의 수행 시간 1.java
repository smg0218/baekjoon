import java.io.*;

public class Main {
    private static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        int[] arr = new int[length];

        int result = MenOfPassion(arr, length);

        System.out.printf(count + "\n" + result);
    }

    private static int MenOfPassion(int A[], int n) {
        int i = n / 2;
        count++;
        return A[i];
    }
}