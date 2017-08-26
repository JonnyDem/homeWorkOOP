package homeWorkOOP;
/*
Теме: блоки инициализации.
Задача 3. Просто проверить в какой последовательности(и сколько раз) будут выполняться блоки инициализации
 Выполняеться в класе MainDivinitial.
 */

public class DivInitial {
    {
        System.out.println("Inicialization block ");
    }
    static{
        System.out.println("static inicialization block");
    }
    public DivInitial(){
        System.out.println("Constructor");
    }
}
