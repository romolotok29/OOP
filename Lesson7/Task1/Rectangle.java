package Task1;

public class Rectangle extends Square {

    float width;
    float height;

    public Rectangle(float width, float height) {
        super(height);
        this.width = width;
    }

    @Override
    public double getArea() {
        double area = width * height;
        System.out.println(area);
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * (width + height);
        System.out.println(perimeter);
        return perimeter;
    }
}
