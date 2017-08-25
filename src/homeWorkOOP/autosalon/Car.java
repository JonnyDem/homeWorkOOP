package homeWorkOOP.autosalon;

public class Car {

    String number;
    String color;
    Track track;

    boolean start;
    boolean move;
    boolean stop;

    public void start(){
        if(!start){
            start = true;
            System.out.println("The car "+ number +" got wound up");
        } else {
            System.out.println("The car "+ number +" has already started");
        }
    }
    public void move(){
        if(!start){
            System.out.println("At the beginning you should wound up the car");
        } else if (start&&move){
            System.out.println("The car is already moving");
        } else {
            if (track!=null) {
                System.out.println("The car "+ number+" has begun moving with track: "+track.number);
                move = true;
                stop = false;
                track.roll();
            } else {
                move = true;
                stop = false;
                System.out.println("The car "+ number+" has begun moving");
            }
        }
    }
    public void stop(){
        if(move){
            if(track!=null){
                System.out.println("The car "+ number + " stops with track "+ track.number);
                stop = true;
                move = false;
                track.stop();
            } else {
                stop = true;
                move = false;
                System.out.println("The car "+ number + " stops");
            }
        } else if(!move&&start){
            stop = true;
            start = false;
            System.out.println("The car "+ number + " turns off the engine");
        } else {
            System.out.println("The car "+ number + " has already being standing");
        }
    }
    public void linkTruck(Track t){
        if (move){
            System.out.println("At the beginning you should stop the car");
        }else if (track == null) {
             this.track = t;
             if (track.car == null) {
                 track.car = this;
                 System.out.println("Auto: " + number + " has been linked to track: " + track.number);
             } else {
                 System.out.println("This truck " + track.number + " has already linked to car " + track.car.number);
                 this.track = null;
             }
         } else {
             System.out.println("This car "+number+" already has a truck "+track.number);
         }

     }
     public  void unlinkTruck(){
         if (move){
             System.out.println("At the beginning you should stop the car");
         } else if(track!=null){
             System.out.println("The track "+ track.number+" was successfully unlinked from car "+number);
             track.car = null;
             track = null;
         } else {
             System.out.println("This car "+number+" doesn't have a truck");
         }
     }
}
