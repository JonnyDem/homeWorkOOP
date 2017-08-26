package homeWorkOOP.figure;

/**
 * Created by Ваня on 26.08.2017.
 *   Тема: Правила наследования.
 *   Задача 1: Все фигуры должны содержать координаты точки и необходимые  стороны для расчетов площади и периметра
 *   есть заготовка класаа Figura и Triangle.  - Добавить пропущенные геттеры и сеттеры
 *                                             - Добавить калсс Square и Rectangle
 *                                             - Подумать над иерархией наследования кто от кого должен наследоваться
 *                                               (Квадрат от прямоугольника или наоборот.)
 */
public class Figura {

    private double xPos;
    private double yPos;
    private double sideA;

    public Figura(){
    }

    public Figura(double xPos, double yPos, double sideA) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.sideA = sideA;
    }

    public double getPerimetr(){
        return 0;
    }

    public double getSquare(){
        return 0;
    }

    public double getSideA() {
        return sideA;
    }

    public double getxPos() {
        return xPos;
    }

    public double getyPos() {
        return yPos;
    }
}
