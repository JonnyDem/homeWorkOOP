package homeWorkOOP.phones;

/**
 * Created by Ваня on 30.08.2017.
 */
public class Samsung extends Phone {

    Samsung(String number, boolean camera, int sideSize){
        super(number,camera,sideSize);
    }

    @Override
    String printModel() {
      return  "Samsung";
    }
}
