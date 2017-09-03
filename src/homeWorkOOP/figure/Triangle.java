package homeWorkOOP.figure;

/**
 * Created by Ваня on 26.08.2017.
 */
public class Triangle extends Figura {

    private double sideB;
    private double sideC;

    public Triangle(double x, double y, double a, double b){
        super(x, y, a);
        sideB = b;
        sideC = Math.sqrt(a * a + b * b);
    }

    @Override
    public double getPerimetr() {
        return getSideA() + sideB + sideC;
    }

    @Override
    public double getSquare() {
        return (getSideA() * sideB) / 2;
    }


    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public static void main(String[] args) {
        Triangle triangle=new Triangle(2,3,4,5);
        System.out.println(triangle.getPerimetr());
        System.out.println(triangle.getSquare());
        System.out.println(triangle.sideC);
    }
}
