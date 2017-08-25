package homeWorkOOP.autosalon;

public class Track {

    String number;
    Car car;

    boolean roll;
    boolean stop;

    public void roll(){
        if(car == null) {
            System.out.println("You can't roll the track " +number+" because it isn't linked to car");
        } else if ( car != null&&!roll){
            roll = true;
            stop = false;
            System.out.println("The track " +number+" begins to roll");
        }
        else {
            System.out.println("The track "+number+" has already being rolling");
        }
    }
    public void stop(){
        if(roll){
            stop = true;
            roll = false;
            car.move = false;
            System.out.println("The track "+number+" stops");
        } else {
            System.out.println("The track "+number+" is already standing");
        }
    }
}
