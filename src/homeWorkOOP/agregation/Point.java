package homeWorkOOP.agregation;

/*
  Тема: Деллигирование
    Просто пробовал агрегирование.
 */

public class Point {
    void  addLetters(){};
}
class Figura {
    private Point point;

    public Point getPoint() {
        return point;
    }

    void commit(){}
}
class MainFig{
    public static void main(String[] args) {
        Figura figura = new Figura();
        figura.getPoint().addLetters();
        figura.commit();
    }
}
