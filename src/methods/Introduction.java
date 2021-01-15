package methods;

public class Introduction {
    public static void main(String[] args) {
        int firstNumber=32;
        int secondNumber = 23;
        int result = maxOf(firstNumber,secondNumber);
        System.out.println(result);
        sayHi();
        sayHi();

    }

    static int  maxOf(int a, int b) {
        return a > b ? a : b;
    }
    static void sayHi(){
        System.out.println("Hi  ");
        System.out.println("Good Morning");
    }
}
