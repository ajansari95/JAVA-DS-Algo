package codeforces;

import java.util.Scanner;

public class YetAnotherInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int temp = a;
            int count = 0;
            while (temp != b) {
                if (Math.max(temp, b) - Math.min(temp, b) >= 10) {
                    if (temp - b > 0) {
                        temp = temp - 10;
                        count++;
                    } else {
                        temp = temp + 10;
                        count++;
                    }
                } else {
                    count++;
                }

            }
            t--;
            System.out.println(count);


        }
    }
}
