package homeWorkOOP;

import java.util.Random;

/**
 * Created by Ваня on 13.08.2017.
 */
public class MainCar {
    public static void main(String[] args) {

        Random random=new Random();


        Car car1=new Car("AA 1457 KK","Black","Geely");
        Track track1=new Track("12-34");


        car1.setTrack(track1);
        car1.start();
        car1.move();
        car1.stop();







    }
}
