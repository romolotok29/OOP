import Task1.*;
import Task2.Accountant;
import Task2.Director;
import Task2.Worker;

public class Main {
    public static void main(String[] args) {

        //Task1 check

        Figure [] figures = new Figure[4];

         figures[0] = new Circle(5.0f);
         figures[1] = new Rectangle(6.5f, 3.0f);
         figures[2] = new Square(8.0f);
         figures[3] = new Triangle(5.5f, 4.0f);

         double sumOfPerimeters = 0.0;

         for (Figure figure : figures) {
             sumOfPerimeters += figure.getPerimeter();
         }

        System.out.println("Sum of perimeters of all figures is : " + sumOfPerimeters);

        System.out.println();


        //Task2 check

        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();

        director.printJobTitle();
        worker.printJobTitle();
        accountant.printJobTitle();

    }
}