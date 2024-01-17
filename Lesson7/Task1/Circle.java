package Task1;

public class Circle extends Figure {


    float radius;
    final double pi = 3.14d;

    public Circle(float radius) {

        this.radius = radius;
    }

    @Override
    public double getArea () {
        double area = pi * (radius * radius);
        System.out.println(radius);
        return (area);
    }

    @Override
    public double getPerimeter () {
        double perimeter = 2 * pi * radius;
        System.out.println(perimeter);
        return perimeter;
    }
}
