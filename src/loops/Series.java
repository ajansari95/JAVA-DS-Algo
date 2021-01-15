package loops;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float ans = 0;
        for (float i = 1; i <= n; i++) {
            if (i % 2 != 0)
                ans = ans + 1 / i;
            else
                ans = ans - 1 / i;

        }
        System.out.println(ans);
    }
}
