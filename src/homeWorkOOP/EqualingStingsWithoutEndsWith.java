package homeWorkOOP;

/**
 * Created by Ваня on 12.08.2017.
 * Тема: Повторение(строки)
 *   Задача 8: Написать метод boolean MyEndsWith, который принимает две строки и возвращщает булевское значение
 *      (не используя endsWith).
 */

public class EqualingStingsWithoutEndsWith {
    public boolean MyEndsWith(String a,String b){
        boolean areEndsWith;
        int count=0;
        for (int i = a.length()-b.length(),index=0; i <a.length() ; i++,index++) {
            if(a.charAt(i)==b.charAt(index)){
               count++;
            }
        }if(count==b.length()){
            areEndsWith=true;
            System.out.println("Да, вторая подстрока являеться окончанием первой: " + areEndsWith);
            return areEndsWith;
        }else{
            areEndsWith=false;
            System.out.println("Нет, вторая подстрока не являеться окончанием первой: "+ areEndsWith);
            return areEndsWith;
        }
    }

    public static void main(String[] args) {
        new EqualingStingsWithoutEndsWith().MyEndsWith("Язык Джава","Джава");
        new EqualingStingsWithoutEndsWith().MyEndsWith("Язык Джава крутой язык программирования","Джава");
    }
}
