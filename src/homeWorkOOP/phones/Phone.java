package homeWorkOOP.phones;

/**
 * Created by Ваня on 30.08.2017.
 */
public abstract class Phone {
    String number;
    boolean camera;
    int sideSize;

    public void call(Phone ph) {
        System.out.println("Phone: " + this.printModel() + " with number " + number + " calls to " + ph.printModel() + " with number: " + ph.number);

    }

    Phone(String number, boolean camera, int sideSize) {
        this.number = number;
        this.camera = camera;
        this.sideSize = sideSize;
    }

    abstract String printModel();
}
