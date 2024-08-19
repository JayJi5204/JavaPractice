package oop1;

public class CarSpeedMain1 {
    public static void main(String[] args) {
        int speed = 0;
        boolean engine = false;

        engine = true;
        System.out.println("Engine Start");
        speed++;
        System.out.println("Now Speed : " + speed);
        speed++;
        System.out.println("Now Speed : " + speed);
        speed--;
        System.out.println("Now Speed : " + speed);
        System.out.println("Check Engine");
        if (engine) {
            System.out.println("Engine On, Now Speed : " + speed);
        } else {
            System.out.println("Engine Off");
        }
        engine = false;
        System.out.println("Engine End");
    }
}
// - 결과값 -
//Engine Start
//Now Speed : 1
//Now Speed : 2
//Now Speed : 1
//Check Engine
//Engine On, Now Speed : 1
//Engine End