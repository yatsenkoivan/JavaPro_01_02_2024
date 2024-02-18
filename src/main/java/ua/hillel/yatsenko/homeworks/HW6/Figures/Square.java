package ua.hillel.yatsenko.homeworks.HW6.Figures;

public class Square implements Figure
{
    private final double side;

    public Square(double side)
    {
        this.side = side;
    }
    @Override
    public double getArea()
    {
        return side * side;
    }
}
