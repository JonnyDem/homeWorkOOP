package homeWorkOOP;

import java.util.Arrays;

/**
 * Created by Ваня on 12.08.2017.
 * Тема: Повторение(строки)
 *   Задача 5: Написать 3 различных метода, принимающий в качестве параметра строку.
 *   Возвращающий перевернутую строку
 */
public class WiseWersaString {

    public String viceWerce1(String str){               // 1-метод
        String viceWercaString = "";
        for (int i = str.length()-1; i >=0 ; i--) {
          viceWercaString += str.charAt(i);
        }
        System.out.println(viceWercaString);
        return viceWercaString;
    }

    public String viceWerce2(String str){                // 2-й метод
        char[]strArray=str.toCharArray();
        str="";
        for (int i = strArray.length-1; i >=0 ; i--) {
            str+=strArray[i];
        }
        System.out.println(str);
        return str;
    }

    public String viceWerce3(String str) {             // 3-й метод
        char []array=str.toCharArray();
        char[]viceWerca=new char[array.length];
        for (int i = array.length-1,count=0; i >=0 ; i--,count++) {
          viceWerca[count]=array[i];
        }
        String s=new String(viceWerca);
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        new WiseWersaString().viceWerce1("улыбок тебе дед макар");
        new WiseWersaString().viceWerce2("улыбок тебе дед макар");
        new WiseWersaString().viceWerce3("улыбок тебе дед макар");
    }
}
