package homeWorkOOP;

import java.util.Random;

/**
 * Created by Ваня on 13.08.2017.
 */
public class MainCar {
    public static void main(String[] args) {

        Random random=new Random();

        Car car1=new Car();
        Car car2=new Car("CC 3333");
        Car car3=new Car("BB 2222","Red");
        Car car4=new Car("AA 1457 KK","Black","Geely");

        car1.printAboutMe();
        car2.printAboutMe();
        car3.printAboutMe();
        car4.printAboutMe();

       car1.number="AA 1111";
        car1.color="Black";
        car1.marka="ZAZ";

        System.out.print("car1 after changeing: ");
        car1.printAboutMe();


        for (int i = 0; i <10; i++) {
            int r=-5+random.nextInt(10+1);
            car1.addHuman(r);
           // car1.printAboutMe();
        }
        for (int i = 0; i <10 ; i++) {
            int r=1+random.nextInt(3);
            car1.randomMerhod(r);
        }


         car1.getCountCars();
         Car.getCountCars();




    }
}
