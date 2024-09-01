import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int count = 0;
            int i=l;
            int inc=1;
            while(i<r){
                if(i+inc<r){
                    i+=inc;
                    inc++;
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}