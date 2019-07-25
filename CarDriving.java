package com.test5.benni.inorderTest;

public class CarDriving {
    Car car;

    public CarDriving(Car car) {
        this.car = car;
    }

    public int driving(int speed, int vSpeed) {
        CarDriving carDriving = new CarDriving(car);
            int speed1 = car.StartDriving(speed);
            int speed2 = car.speedUp(vSpeed);
            return speed1+speed2;
    }
}
