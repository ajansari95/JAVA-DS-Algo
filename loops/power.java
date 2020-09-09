package loops;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int base = sc.nextInt();
        int power = sc.nextInt();
        int ans =1;
//        int ans =1;
        for(int i=0;i<power;i++){
            ans = ans * base;

        }
        System.out.println(ans);
    }
}
