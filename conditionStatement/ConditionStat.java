package conditionStatement;

import java.util.Scanner;

public class ConditionStat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int petals = sc.nextInt();
        if(petals%2 == 0){
            System.out.println("loves me not");
        }
        else if(petals==1){
            System.out.println("no flower bitch");
        }
        else if( petals >20 && petals<=30){
            System.out.println("number less than 30");
        }
        else {
            System.out.println("loves me");
        }
        int number = (petals>10)?1:0;
        System.out.println(number);

    }
}
