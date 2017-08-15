package homeWorkOOP;

import java.util.Scanner;

/**
 * Created by Ваня on 12.08.2017.
 * Тема: Повторение(строки)
 *   Задача 4: Написать программу состоящию из методов:  - метод, считывает с консоли строку и возвращает ее
 *                                                       - метод, считывает с консоли символ и возрващает его
 *                                                       - метод, принимает строку и символ, делает поиск символов в
 *                                                       строке, возвращает индекс последнего вхождения символа в строке
 *                                                       - главный метод, только вызовы методов.
 *
 */
public class FindIndexInArray {

    public static String scan(boolean str){                // Метод вызова сканера
        Scanner scan=new Scanner(System.in);
        if(str){
            System.out.println("Введите строку");
            String s1=scan.nextLine();
            return s1;
        }else {
            System.out.println("Введите один символ");
            String s2=scan.nextLine();
            return s2;
        }
    }

    public String str(String s){                    // Метод возвращающий строку
        return s;
    }

    public  char symbol(String s){              // Метод возвращающий символ
        char ch;
        String []array=s.split("");
        if(array.length>1){
            return this.symbol(scan(false));
        }else{
            ch=(char)s.charAt(0);
        }
        return ch;
    }


  public static  int indexOfString(String str, char ch){     // Метод возвращает индекс последнего вхождения символа в строке.
        int index;
        int count=str.length();
        if(count>0) {
            for (int i = str.length()-1; i >= 0; i--) {
                if (str.charAt(i) == ch) {
                    index = i;
                    System.out.println("Этот символ совпадает с индексом "+index+" строки");
                    return index;
                }else{
                    count--;
                }
            }
        } if(count==0){
            System.out.println("Такого символа нет в строке");
        }
      return -1;
    }



    public static void main(String[] args) {

        FindIndexInArray findIndex=new FindIndexInArray();

      char ch= new FindIndexInArray().symbol(scan(false));
      String st= new FindIndexInArray().str(scan(true));
        new FindIndexInArray().indexOfString(st,ch);
    }
}
