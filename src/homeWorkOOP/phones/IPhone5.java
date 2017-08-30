package homeWorkOOP.phones;

/**
 * Created by Ваня on 30.08.2017.
 */
    public class IPhone5 extends IPhone {

    IPhone5(String number, boolean camera, int sideSize, int appleId){
        super(number,camera,sideSize,appleId);
    }

    @Override
    String printModel() {
       return "IPhone5";
    }
}
