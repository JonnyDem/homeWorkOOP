package homeWorkOOP.taskpage53;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ваня on 31.08.2017.
 */
public class MainClass {
    static AbstractHuman[] array = new AbstractHuman[4];
    static Map<Integer, AbstractTable> tables = new HashMap<>();

    public static void main(String[] args) {

       addHumanToArray();
       addTableToList();
        putRandomGlasses();
        System.out.println();
        printAboutAllHuman();
        pourWaterOnTable();
        System.out.println();
        checckingIsDry();
    }

    private static void checckingIsDry() {
        for (int i = 1; i <=tables.size() ; i++) {
            tables.get(i).isDry();
        }
    }

    private static void pourWaterOnTable() {
        for (int i = 0; i <array.length ; i++) {
            int x=(int)(10*Math.random()+1);
            array[i].pourWaterOnTable(tables.get(x));
        }
    }

    private static void printAboutAllHuman() {
        for (int i = 0; i <array.length ; i++) {
            array[i].printAboutMe();

        }
   }

    private static void putRandomGlasses() {
        for (int i = 0; i <array.length ; i++) {
            int x=(int)(2*Math.random()+1);
            if(x==1){
                AbstractGlass glass1=new GlassCircke();
                array[i].takeGlass(glass1);
            } else {
                AbstractGlass glass2=new GlassSquare();
                array[i].takeGlass(glass2);
            }
        }
    }

    private static void addTableToList() {
        for (int i = 1; i <=10 ; i++) {
           tables.put(i,new Table());
        }
    }

    private static void addHumanToArray() {
        for (int i = 0; i <array.length ; i++) {
            int x = (int) (2 * Math.random()+1);
            if(x==1) {
                  array[i] = new HumanWoman();
            } else {
                array[i] = new HumanMan();
            }
        }
    }

}
