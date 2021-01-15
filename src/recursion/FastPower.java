package recursion;

public class FastPower {
    public static void main(String[] args) {
        System.out.println(slowPower(2,8));
        System.out.println(fastPower(2,8));
    }
    static int slowPower(int a, int b){
        if(b==0){
            return 1;
        }
        return a* slowPower(a,b-1);
    }
    static int fastPower(int a,int b){
        if(b==0){
            return 1;
        }
        if(b%2==0){
            return fastPower(a*a,b/2);
        }
        else {
            return a * fastPower(a, b - 1);
        }
    }

}
