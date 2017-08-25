package homeWorkOOP;

/*Тема: Списки для объектов.
  Задача 2: Создать класс Track с полем  String number.
  В классе MainTrack проверить корректность описания методов.

 */

public class Track {

    String number;
    boolean roll;
    boolean stop;
    Car car=null;

    public void linkToCar(Car car){
        if(this.car==null){
        this.car=car;
            System.out.println("The track "+number+" linked to car "+car.number);
        }else{
            System.out.println("This track "+number+" has already linked to car");
        }
    }
    public void unLinkFromCar(){
        if(car!=null) {
            System.out.println("The track " + number + " unlinked from car " + car.number);
            car.track=null;
            car = null;
        }else{
            System.out.println("The track "+number +" has already unlinked");
        }
    }

   public Track(String number){   // Конструктор.
       this.number=number;

   }

    public void roll(){   // Метод. Начать катиться(не должен повторно катиться если уже катится)
        if(!roll&&car==null){
            roll=true;
            stop=false;
            System.out.println("The track with number "+number+ " is rolling!");
        }else if(!roll&&car!=null){
            System.out.println("You can't roll the track " + number + " because it linked to car: " + car.number);
        }
        else {
            System.out.println("The track with "+number+ " has already rolled !");
        }
    }

    public void stop(){  //Метод. Остановить качение(не должен повторно останавливаться если уже остановленно)
       if(roll&&car==null){
           stop=true;
           roll=false;
           System.out.println("The track with number "+number+" is stopping!");
       }else if(roll&&car!=null){
           System.out.println("You can't stop the track " + number + " because it linked to car " + car.number);
       }
       else if(car!=null&&!stop){
           System.out.println("The track with number "+number+" is stopping with car "+car.number);
           stop=true;
       }
       else{
           System.out.println("The track with number "+number+ " has already stopped!");
       }
    }
}
