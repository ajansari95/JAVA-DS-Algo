package oops.finalKeyword;

public class MainClass {
    final int ROLL_NO = 12;

    public static void main(String[] args) {
        final Student obj = new Student();
        Student obj2 = new Student();
        obj.name = obj2.name;

    }
}
