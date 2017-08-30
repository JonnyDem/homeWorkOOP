package homeWorkOOP.phones;

/**
 * Created by Ваня on 30.08.2017.
 */
public abstract class IPhone extends Phone {

    int appleId;

    IPhone(String number, boolean camera, int sideSize, int appleId) {
        super(number, camera, sideSize);
        this.appleId = appleId;
    }

    public void printAppleId(){
        System.out.println("Apple Id: " + appleId);
    }
}
