package homeWorkOOP;

/**
 * Created by Ваня on 13.08.2017.
 * Тема: геттеры и сеттеры
 * Задача 4: класс которой реализуеться в классе MainCar
 *  Она описана в брошуре, здесь просто дополненна.
 */
public class Car {
    String number;
    String color;
    String marka;

   Track track;
    private static int countOfCars = 0;

    int countHuman=0;

    boolean start;
    boolean move;
    boolean stop;




    public void printAboutMe(){
        System.out.println(number+", "+color+", "+ marka+", count of passangers: "+countHuman);
    }


    public void setTrack(Track tr) {
        if(track==null){
            track = tr;
            if(track.car==null) {
                System.out.println("The car " + number + " hooks up the track " + track.number);
                track.linkToCar(this);
            } else{
                System.out.println("This track "+track.number+" has already linked to car "+track.car.number);
                track=null;
            }
        }
        else{
            System.out.println("This car already has track: "+track.number);
        }
    }
    public void unSetTrack() {
        if (track != null) {
            track.unLinkFromCar();
            System.out.println("The car " + number + " unlocked track "+track.number);
            track = null;
        } else {
            System.out.println("The car " + number + " is already without track ");
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getColor() {
        return color;
    }

    public String getNumber() {
        return number;
    }

    public String getMarka() {
        return marka;
    }

    public void addHuman(int count){
        this.countHuman+=count;
    }

    public void start(){
        if(!start) {
            System.out.println("Авто:" + number + " завелось.");
            start=true;
        }
          else  if(move) {
            System.out.println("Авто: "+number+" не может завистьсь, так как уже едет.");
        }
               else if(start){
            System.out.println("Авто: "+number+" не может завистьсь, так как уже заведенная.");
                }
            }

            public void move(){
        if(!move&&start){
            if(track!=null){
                move = true;
                stop = false;
                track.roll = true;
                track.stop = false;
                System.out.println("Авто: "+number+" поехало вместе с прицепом: "+track.number);
            }else {
                System.out.println("Авто: " + number + " поехало.");
                stop = false;
                move = true;
            }
        } else if(move){
            System.out.println("Авто: "+number+" не могу ехать, так как уже еду.");
        }else if(!start){
            System.out.println("Авто: "+number+" не может ехать, так как еще не заведена.");
        }
            }

            public void stop(){
                if(start&&move){
                    if (track != null) {
                        System.out.println("Авто: "+number+" вместе с прицепом: "+track.number+" остановилось и выключело двигатель.");
                        stop=true;
                        start=false;
                        move=false;
                        track.stop = true;
                        track.roll = false;
                    }else {
                        System.out.println("Авто: " + number + " остановилась и выключила двигатель.");
                        stop = true;
                        start = false;
                        move = false;
                    }
                } else if(!move&&start){
                    System.out.println("Авто: "+number+" не может остановиться так как заведенная стоит.");
                } else if(!start){
                    System.out.println("Авто: "+number+" не может остановиться так как не заведенная стоит.");
                }
            }

            public void randomMerhod(int n){
                switch (n){
                    case 1:
                        start();
                        break;
                    case 2:
                        move();
                        break;
                    case 3:
                        stop();
                        break;
                }
            }
            public static int getCountCars(){
                System.out.println("Count of cars: "+countOfCars);
                return countOfCars;
            }

    public Car() {

        this("default");
    }

    public Car(String number) {

        this(number, "default");
    }

    public Car(String number, String color) {

        this(number, color, "default");
    }

    public Car(String number, String color, String marka) {

        this.number = number;
        this.color = color;
        this.marka = marka;
        countOfCars+=1;
    }

        }


