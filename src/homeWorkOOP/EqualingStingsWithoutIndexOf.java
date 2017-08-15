package homeWorkOOP;

/**
 * Created by Ваня on 12.08.2017.
 * Тема: Повторение(строки)
 *   Задача 7: Написать метод int MyIndexOf, который принимает две строки и ищет подстроку в строке(не используя indexOf)
 */

public class EqualingStingsWithoutIndexOf {

    public int myIndexOf(String a, String b) {
        int index = 0;
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (b.charAt(0) == a.charAt(i)) {
                index = i;
                count = 0;
                if (a.length() - i >= b.length())
                    for (int j = 0; j < b.length(); j++) {
                        if (b.charAt(j) == a.charAt(i)) {
                            count++;
                            i++;
                            if (count == b.length()) {
                                System.out.println("Да, вторая строка являеться подстрокой с "+index+"-го индекса первой строки.");
                                return index;
                            }
                        }
                    }
            }
        }if(count!=b.length()){
        System.out.println("Нет, вторая строка не являеться подстрокой первой строки.");
    }
        return -1;
}

    public static void main(String[] args) {

       new EqualingStingsWithoutIndexOf().myIndexOf("макар де де де","дед");
        new EqualingStingsWithoutIndexOf().myIndexOf("макар де де дед","дед");
    }
}
