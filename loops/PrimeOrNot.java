package loops;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            System.out.println(n%i);
            if (n % i == 0) {
//                System.out.println("not prime");
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("not prime");
        }else{
            System.out.println("prime");
        }
    }
}
