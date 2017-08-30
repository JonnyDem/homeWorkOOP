package homeWorkOOP.phones;

/**
 * Created by Ваня on 30.08.2017.
 */
public class IPhone4 extends IPhone {

    IPhone4(String number, boolean camera, int sideSize, int appleId){
        super(number,camera,sideSize,appleId);

    }

    @Override
    String  printModel() {
       return "IPhone4";
    }
}
