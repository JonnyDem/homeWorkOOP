package homeWorkOOP.conditioner;

/*
Тема : Делегирование
Задача 3: (стр 45-46)
 */

import java.util.ArrayList;
import java.util.Scanner;

public class BlockConditioners {

    static ArrayList<Conditioner> conditioners = new ArrayList<>();

     BlockConditioners(){
        for (int i = 0; i <10 ; i++) {
            conditioners.add(i, new Conditioner());
        }
    }


    public class Conditioner{
       private int temperature;
       private boolean turnOn;
       private boolean getTurn;

        public int setTemperature() {
            Scanner scan=new Scanner(System.in);
            System.out.println("Select temperature from 5 to 27");
            int temperature = scan.nextInt();
            if (temperature >= 5 && temperature <= 27) {
                this.temperature = temperature;
                System.out.println("The temperature is set on " + temperature + " degrees.");
                return temperature;
            } else {
                return setTemperature();
            }
        }

        public int getTemperature() {
            return temperature;
        }

        public void turnOn(){
            if(turnOn){
                System.out.println("This conditioner has already been turned on.");
            } else {
                turnOn = true;
                getTurn();
                System.out.println("This conditioner is turned on.");
            }

        }
        public void turnOf(){
            if(!turnOn){
                System.out.println("This conditioner has already been turned off.");
            } else {
               this.turnOn = false;
                getTurn();
                System.out.println("This conditioner is turned off.");
            }

        }
        public void getTurn(){
        if(turnOn){
            getTurn = true;
        } else {
            getTurn = false;
        }
        }

        public boolean isGetTurn() {
            return getTurn;
        }
        public boolean isTurnOn() {
            return turnOn;
        }
    }
}
