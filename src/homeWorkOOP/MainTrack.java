package homeWorkOOP;


/*  Тема: Списки для объектов.
Заладача 2. Описание задачи в классе Track.

 */

public class MainTrack {

    public static void main(String[] args) {

        Track track1=new Track("12-34");
        Track track2=new Track("56-67");

        track1.roll();
        track2.roll();
        track1.roll();

        track1.stop();
        track2.stop();
        track2.stop();

    }
}
