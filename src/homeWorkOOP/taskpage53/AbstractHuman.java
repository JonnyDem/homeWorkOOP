package homeWorkOOP.taskpage53;

/**
 * Created by Ваня on 31.08.2017.
 */
public abstract class AbstractHuman implements Humanable {

    String sex;
    boolean glass;
    AbstractGlass someGlass;

    AbstractHuman(String sex){
        this.sex = sex;
    }

    @Override
    public void takeGlass(AbstractGlass glass) {
        someGlass=glass;
        this.glass=true;
        System.out.println("I'm a " + sex + " take a " + glass.type);
    }

    @Override
    public void putGlass() {
        System.out.println("I'm a " + sex + " put the " + someGlass.type);
        this.glass = false;
        someGlass = null;
    }

    @Override
    public void pourWaterOnTable(AbstractTable table) {
        table.dry=false;
    }

    @Override
    public void fillGlass() {

    }

    @Override
    public void printAboutMe() {
        if(glass){
            System.out.println("I'm a " + sex + " have a " + someGlass.type);
        } else {
            System.out.println("I'm a " + sex + " don't have a");
        }
    }
}
