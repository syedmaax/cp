import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            boolean flag = true;


            if (n < 4 && n != 1) {
                System.out.println("NO");
                continue;
            }


            if (n == 1) {
                System.out.println(s.charAt(0) == '1' ? "YES" : "NO");
                continue;
            }


            int sqrt = (int) Math.sqrt(n);
            if (sqrt * sqrt != n) {
                System.out.println("NO");
                continue;
            }


            for (int i = 0; i < n; i++) {
                int row = i / sqrt;
                int col = i % sqrt;


                if (row == 0 || row == sqrt - 1 || col == 0 || col == sqrt - 1) {
                    if (s.charAt(i) != '1') {
                        flag = false;
                        break;
                    }
                } else {
                    if (s.charAt(i) != '0') {
                        flag = false;
                        break;
                    }
                }
            }
            System.out.println(flag ? "YES" : "NO");
        }
    }
}
