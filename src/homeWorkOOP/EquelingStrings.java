package homeWorkOOP;

/**
 * Created by Ваня on 12.08.2017.
 * Тема: Повторение(строки)
 *   Задача 6: Написать метод boolean, который принимает две строки и сравнивает их(не используя equals)
 */
public class EquelingStrings {

    public boolean areStringsEquel(String a,String b){
        int count=0;
        for (int i = 0; i <a.length()-1 ; i++) {
            if(a.charAt(i)!=b.charAt(i)){
                count++;
            }
        }if(count==0){
            System.out.println("Да,эти строки одинаковые");
            return true;
        }else {
            System.out.println("Эти строки разные");
            return false;
        }
    }
    public static void main(String[] args) {

        new EquelingStrings().areStringsEquel("Нет","Да");
        new EquelingStrings().areStringsEquel("Да","Да");
    }
}
