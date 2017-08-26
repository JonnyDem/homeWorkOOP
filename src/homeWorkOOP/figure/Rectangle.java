package homeWorkOOP.figure;

/**
 * Created by Ваня on 26.08.2017.
 */
public class Rectangle extends Triangle {

   private double sideD;
   private double sideE;

    Rectangle(double x, double y, double a, double b) {
        super(x, y, a, b);
        sideD = getSideA();
        sideE = getSideB();

    }

    @Override
    public double getPerimetr() {
        return sideD*2+sideE*2;
    }

    @Override
    public double getSquare() {
        return sideD * sideE;
    }
}
