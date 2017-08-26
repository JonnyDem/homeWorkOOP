package homeWorkOOP.task2;

/**
 * Created by Ваня on 26.08.2017.
 */
public class B extends A {

    B(){
        System.out.println("Constructor B");
    }
    {
        System.out.println("Block B");
    }

    static {
        System.out.println("Static block B");
    }
}
