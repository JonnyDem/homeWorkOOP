import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ваня on 12.08.2017.
 *   Тема: Повторение(строки)
 *   Задача 3: Ввести с консоли строку. Посчитать количество слов в строке.
 *                    Примечание: набор символов без пробелов- будем называть словами.
 */
public class CountOfWordsWithSpace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку (с символами и пробелами).");
        String str=scan.nextLine();
      new CountOfWordsWithSpace().quantityOfWords(str);


    }
    public int quantityOfWords(String str){
        int count=0;
        String array[]=str.split(" ");
            for (int i = 0; i <array.length ; i++) {
                if(!array[i].equals("")){
                  count++;
                }
            }
        System.out.println("Количество слов: "+count);

        return count;
    }
}
