package homeWorkOOP;

/**
 * Created by Ваня on 15.08.2017.
 *   Тема: Массив объектов.
 *   Задача 3 : Создать класс Phone с полями : private static Phone[]phones= new Phone[10];
 *                                             private String myNumber;
 *                                             private String mark;
 *   Изначально phones не содержит телефонов, все телефоны добавляются через конструктор. При создании нового объекта-
 *   телефона, мы должны указать его номер и он вноситься в базу номеров phones. Добавить методы... (напротив метода описание)
 *
 *    В классе MainPhone: -создать несколько телефонов с какими-то номерами
 *                        - попробовать проверить оналичие существующего и несуществующего номера.
 *                        - для случайного телефоно вызвать метод call и пусть звонит на случайный телефон.
 *
 *
 */
public class Phone {

    private static Phone[]phones= new Phone[10];
    private String myNumber;
    private String mark;
    private static int countOfUsers=0;

  //  private Phone(String number){
   //        myNumber=number;

   // }
    public Phone(String number,String markOfSelphone){   // Конструктор
        countOfUsers+=1;
       for (int i = 0; i <phones.length ; i++) {
         if(phones[i]==null){
             myNumber=number;
             mark=markOfSelphone;
             phones[i]=this;
             // phones[i]=new Phone(number);
            // phones[i].mark=markOfSelphone;
            break;
         }
       }if(countOfUsers>10){
            System.out.println("There are no place");
        }
   }
    public String getMyNumber() {
        System.out.println("number: "+myNumber);
        return myNumber;
    }

    public String getMark() {
        System.out.println("mark: "+mark);
        return mark;
    }
    public static  void isNumberExist(String number){             // Проверяет наличие телефона в базе.
        int count=0;
        for (int i = 0; i <phones.length ; i++) {
            if(phones[i]!=null&&phones[i].myNumber.equals(number)){
                count+=1;
                System.out.println("Yes, this number exists.");
            }
        } if(count==0){
            System.out.println("No, this number doesn't exist.");
        }

    }
    public void call(String number){ // Выводит не экран ""телефон такой-то(номер + марка) звонит такому-то(номер + марка)
        int count=0;
        for (int i = 0; i <phones.length ; i++) {
            if (phones[i] != null && number.equals(phones[i].myNumber)) {
                count += 1;
                System.out.println(this.myNumber + " " + this.mark + " calls to " + phones[i].mark + " " + phones[i].myNumber);
            }
        } if(count==0){
            System.out.println("This number is upsent in data base.");
        }
    }

    public static int getRandomPhone(){    // возвращает случайный телефон из базы данных.
        int random=(int)(phones.length*Math.random());
        int random2=(int)(phones.length*Math.random());
        if(phones[random]!=null&&phones[random2]!=null&&random!=random2) {
            phones[random].call(phones[random2].myNumber);
        }else{getRandomPhone();}
        return random;
    }

    public static void showDataBase(){
        for (int i = 0; i <phones.length ; i++) {
            if(phones[i]!=null) {
                System.out.print(phones[i].myNumber + ", ");
                System.out.println(phones[i].mark);
            }
        }
    }
}
