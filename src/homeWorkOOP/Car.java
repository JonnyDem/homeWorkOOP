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
    int countHuman=0;

    boolean start;
    boolean move;
    boolean stop;


    public void printAboutMe(){
        System.out.println(number+", "+color+", "+ marka+", count of passangers: "+countHuman);
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
            System.out.println("Авто: "+number+" поехало.");
            move=true;
        } else if(move){
            System.out.println("Авто: "+number+" не могу ехать, так как уже еду.");
        }else if(!start){
            System.out.println("Авто: "+number+" не может ехать, так как еще не заведена.");
        }
            }

            public void stop(){
                if(start){
                    System.out.println("Авто: "+number+" остановилась и выключила двигатель.");
                    stop=true;
                    start=false;
                    move=false;
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
    }

        }


