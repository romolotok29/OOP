package Task1;

public class Square extends Figure {

    float height;


    public Square(float height) {
        this.height = height;
    }

    @Override
    public double getArea () {
        double area = height * height;
        System.out.println(area);
        return area;
    }

    @Override
    public double getPerimeter () {
        double perimeter = 4 * height;
        System.out.println(perimeter);
        return perimeter;
    }
}
