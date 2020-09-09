package methods;

public class PassByValue {
    public static void main(String[] args) {
        int a =20;
        int b= 30;
        swap(a,b);
//        System.out.println(a + " : a");
//        System.out.println(b + " : b");
        Dog c = new Dog();
        c.legs=3;
        Dog d = new Dog();
        d.legs= 4;
        swap(c,d);
        System.out.println(c.legs);
        System.out.println(d.legs);
        Dog star = new Dog();
        star.legs = 4;
        change_dog(star);
        System.out.println(star.legs);

    }

    static void swap(int a, int b){
        int temp =a;
        a=b;
        b= temp;
    }
    static void swap(Dog a , Dog b){
        Dog temp = a;
        a=b;
        b=temp;
    }
    static void change_dog(Dog dog){
        dog.legs=12;
    }
}

class Dog{
    int legs;
}
