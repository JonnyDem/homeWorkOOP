package homeWorkOOP;

import java.util.Arrays;

/**
 * Created by Ваня on 15.08.2017.
 *  Задача 3.
 *   Тема: Массив объектов.
 *       Описание задачи находится в классе Phone.
 */
public class MainPhone {
    public static void main(String[] args) {

        Phone phone1=new Phone("12345","Samsung");
        Phone phone2=new Phone("09876","Nokia");
        Phone phone3=new Phone("19756","Nokia");
        Phone phone4=new Phone("87530","Meizu");
        Phone phone5=new Phone("09653","Wilefox");
        Phone phone6=new Phone("25674","Lg");
        Phone phone7=new Phone("17648","Huawei");

        Phone.isNumberExist("00000");
        Phone.isNumberExist("12345");

        Phone.getRandomPhone();


    }
}
