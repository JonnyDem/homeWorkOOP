package homeWorkOOP.autosalon;

import java.util.ArrayList;
import java.util.Scanner;

public class AutoSalon {

    static ArrayList<Car> cars = new ArrayList<>();
    static ArrayList<Track> tracks = new ArrayList<>();
  final String[] menuList={"1.Add new auto","2.Add new track","3.Link track to auto","4.Unlink track","5.Show list of auto","6.Show list of tracks","7.Show if auto linked with track","8.Call start() to auto (index of auto)","9.Call move() to auto (index of auto)","10.Call stop() to auto (index of auto)","11.Call roll() to track (index of track)","12.Call stop() to track (index of track)","13.Show list of all autos and tracks that linked (with conditions)","14.Exit"};

    public  void  start(){
        boolean runWhile=true;
        Scanner scan = new Scanner(System.in);
        while (runWhile) {
            System.out.println("Select operation");
            printMenuList();
            int selection = scan.nextInt();
            switch (selection) {
                case 1:
                    Car car = new Car();
                    System.out.println("Enter car number");
                    String x = scan.nextLine(); // Это заглушка, она не исполняеться (для того чтоб не перескакивало).
                    String num = scan.nextLine();
                    car.number = num;
                    cars.add(car);
                    break;
                case 2:
                    Track track = new Track();
                    System.out.println("Enter truck number");
                    String x2 = scan.nextLine();  // Такая же заглушка.
                    String truckNum = scan.nextLine();
                    track.number = truckNum;
                    tracks.add(track);
                    break;
                case 3:
                    System.out.println("Select index of car witch you want to link");
                    int carIndex = scan.nextInt();
                    System.out.println("Select index of truck witch you want to link with selected car");
                    int trackIndex = scan.nextInt();
                    if (cars.get(carIndex) != null && tracks.get(trackIndex) != null)
                        cars.get(carIndex).linkTruck(tracks.get(trackIndex));
                    else {
                        System.out.println("No object under this index.");
                    }
                    break;
                case 4:
                    System.out.println("Select index of car witch you want to unlink");
                    int carIndexToUnlink = scan.nextInt();
                    if (cars.get(carIndexToUnlink) != null)
                        cars.get(carIndexToUnlink).unlinkTruck();
                    else {
                        System.out.println("No car under this index.");
                    }
                    break;
                case 5:
                    if (cars.size() != 0) {
                        for (Car c : cars) {
                            System.out.print("number: " + c.number+", ");
                            System.out.println("color: " + c.color);
                        }
                    } else {
                        System.out.println("There no objects in the list");
                    }
                    break;
                case 6:
                    if (tracks.size() != 0) {
                        for (Track t : tracks) {
                            System.out.println("truck number: " + t.number);
                        }
                    } else {
                        System.out.println("There no objects in the list");
                    }
                    break;
                case 7:
                    int count = 0;
                    if(cars.size()!=0) {
                        for (Car c : cars) {
                            if (c.track != null) {
                                System.out.println("Auto: " + c.number + " linked with track: " + c.track.number);
                            } else {
                                count++;
                            }
                        }
                    } if(count!=0){
                    System.out.println("There aren't cars with tracks");
                }
                    else {
                        System.out.println("There no objects in the list.");
                    }
                    break;
                case 8:
                    System.out.println("Select index of car witch you want to start");
                    int carIndexToStart = scan.nextInt();
                    if (cars.get(carIndexToStart) != null)
                        cars.get(carIndexToStart).start();
                    else {
                        System.out.println("No car under this index.");
                    }
                    break;
                case 9:
                    System.out.println("Select index of car witch you want to move");
                    int carIndexToMove = scan.nextInt();
                    if (cars.get(carIndexToMove) != null)
                        cars.get(carIndexToMove).move();
                    else {
                        System.out.println("No car under this index.");
                    }
                    break;
                case 10:
                    System.out.println("Select index of car witch you want to stop");
                    int carIndexToStop = scan.nextInt();
                    if (cars.get(carIndexToStop) != null)
                        cars.get(carIndexToStop).stop();
                    else {
                        System.out.println("No car under this index.");
                    }
                    break;
                case 11:
                    System.out.println("Select index of track witch you want to roll");
                    int trackIndexToRoll = scan.nextInt();
                    if (tracks.get(trackIndexToRoll) != null)
                        tracks.get(trackIndexToRoll).roll();
                    else {
                        System.out.println("No track under this index.");
                    }
                    break;
                case 12:
                    System.out.println("Select index of track witch you want to roll");
                    int trackIndexToStop = scan.nextInt();
                    if (tracks.get(trackIndexToStop) != null)
                        tracks.get(trackIndexToStop).stop();
                    else {
                        System.out.println("No track under this index.");
                    }
                    break;
                case 13:
                    int co = 0;
                    if(cars.size()!=0) {
                        for (Car c : cars) {
                            if (c.track != null) {
                                System.out.println("Car " + c.number + " is linked to track " + c.track.number + ", car start: " + c.start + ", car move: " + c.move + ", car stop: " + c.stop + ", track stop: " + c.track.stop + ", track roll: " + c.track.roll);
                            } else {
                                co++;
                            }
                        }
                    }if(co!=0){
                    System.out.println("There aren't cars in the list witch linked with trucks");
                } else {
                        System.out.println("There no objects in the list");
                    } break;
                case 14:
                    runWhile = false;
                    break;
                    default:
                        System.out.println("This operation isn't available. Please select from 1 to 14!");
            }
        }
    }

    public void printMenuList(){
        for(String s:menuList){
            System.out.println(s);
        }
    }

}