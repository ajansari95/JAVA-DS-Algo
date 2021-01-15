package loops;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
//        for(int i =100; i>0;i--){
//            System.out.println("Hell boy " + i);
//        }
//        int sum =0;
//        int n =73;
//        for(int i =0;i<=n;i++){
//            sum = sum + i;
//        }
//        System.out.println(sum);
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int fact = 1;

        for (int i = m; i > 0; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}

