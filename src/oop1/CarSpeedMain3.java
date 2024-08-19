package oop1;

public class CarSpeedMain3 {
    public static void main(String[] args) {
        CarSpeed driver = new CarSpeed();
        driver.on();
        driver.speedUp();
        driver.speedUp();
        driver.speedDown();
        driver.off();
        driver.showStatus();
        
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
