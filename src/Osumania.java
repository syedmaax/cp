import java.util.Scanner;

public class Osumania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            char[][] arr = new char[n][4];
            for (int i = 0; i < n; i++) {
                String line = sc.nextLine();
                for (int j = 0; j < 4; j++) {
                    arr[i][j] = line.charAt(j);
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                for (int j = 0; j < 4; j++) {
                    if (arr[i][j] == '#') {
                        System.out.print((j + 1) + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
