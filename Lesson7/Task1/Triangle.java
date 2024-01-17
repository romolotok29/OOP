package Task1;

public class Triangle extends Figure {

    float base;
    float side;


    public Triangle(float base, float side) {
        this.base = base;
        this.side = side;
    }

    @Override
    public double getArea() {
        double area = (base * side)/2;
        System.out.println(area);
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 3 * side;
        System.out.println(perimeter);
        return perimeter;
    }
}
