package ua.hillel.yatsenko.homeworks.HW6.Figures;

public class Circle implements Figure
{
    private final double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }
    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
}
