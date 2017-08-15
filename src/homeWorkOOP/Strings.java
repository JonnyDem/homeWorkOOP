package homeWorkOOP;

import java.util.Arrays;

/**
 * Created by Ваня on 12.08.2017.
 */
public class Strings {
    public static void main(String[] args) {
        String s="дед макар";
        String[] t=s.split(" ");
        char[] c=s.toCharArray();
        System.out.println(Arrays.toString(t));
    }
}
