package oops;
class Vehicle{
    int wheels;
    Vehicle(int no){
        wheels=no;
    }
}
public class MyConstructor {
    MyConstructor(){
        System.out.println("obj created");
    }
    public static void main(String[] args) {
        Vehicle car = new Vehicle(5);
        System.out.println(car.wheels);


    }
}
