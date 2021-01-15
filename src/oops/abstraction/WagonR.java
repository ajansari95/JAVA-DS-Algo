package oops.abstraction;

public class WagonR extends Car {
    public void accelerate() {
        System.out.println("WagonR is accelerating ");
    }

    @Override
    public void brake() {
        System.out.println("Wagonr is braking");
    }


}
