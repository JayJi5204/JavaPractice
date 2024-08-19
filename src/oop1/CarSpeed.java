package oop1;

public class CarSpeed {
    int speed = 0;
    boolean engine = false;

    void on() {
        engine = true;
        System.out.println("Engine Start");
    }

    void off() {
        engine = false;
        System.out.println("Engine Off");
    }

    void speedUp() {
        speed++;
        System.out.println("Now Speed : " + speed);
    }

    void speedDown() {
        speed--;
        System.out.println("Now Speed : " + speed);
    }

    void showStatus() {
        System.out.println("Check Engine");
        if (engine) {
            System.out.println("Engine On, Now Speed : " + speed);
        } else {
            System.out.println("Engine Off");
        }
    }
}
