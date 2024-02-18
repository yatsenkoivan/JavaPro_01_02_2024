package ua.hillel.yatsenko.homeworks.HW6.Figures;

public class Main
{
    public static void main(String[] args)
    {
        Main main = new Main();
        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(3, 4, 5);
        figures[1] = new Circle(5);
        figures[2] = new Square(4);
        figures[3] = new Circle(8.2);
        figures[4] = new Triangle(12,12,12);

        System.out.println(main.totalArea(figures));
    }

    public double totalArea(Figure[] figures)
    {
        double total = 0;
        for (Figure figure : figures)
        {
            total += figure.getArea();
        }
        return total;
    }
}
