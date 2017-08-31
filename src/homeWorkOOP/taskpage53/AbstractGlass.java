package homeWorkOOP.taskpage53;

/**
 * Created by Ваня on 31.08.2017.
 */
public abstract class AbstractGlass implements Glassable {

    String type;

    AbstractGlass(String type){
        this.type=type;
    }

    @Override
    public void pourFromMe() {
        System.out.println("I'm a " +this.type+ "  pouring out.");
    }
}
