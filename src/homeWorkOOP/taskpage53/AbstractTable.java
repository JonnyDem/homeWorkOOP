package homeWorkOOP.taskpage53;

/**
 * Created by Ваня on 31.08.2017.
 */
public abstract class AbstractTable implements Tablable {

    boolean dry;

    @Override
    public boolean isDry() {
        if(dry){
            System.out.println("This table is dry");
        } else {
            System.out.println("This table is wet");
        }
        return dry;
    }
}
