package ua.hillel.yatsenko.homeworks.HW5.Animals;

import ua.hillel.yatsenko.homeworks.HW5.Observers.AnimalObserver;

public class Dog extends Animal
{
    public static final double MAX_RUN_DISTANCE = 500;
    public static final double MAX_SWIM_DISTANCE = 10;

    public Dog(AnimalObserver... observers)
    {
        super(observers);
    }

    @Override
    public void run(double distance)
    {
        if (distance <= MAX_RUN_DISTANCE)
        {
            System.out.println("Dog ran " + distance + " meters");
            return;
        }
        System.out.println("Dog can't run " + distance + " meters");
    }

    @Override
    public void swim(double distance)
    {
        if (distance <= MAX_SWIM_DISTANCE)
        {
            System.out.println("Dog swam " + distance + " meters");
            return;
        }
        System.out.println("Dog can't swim " + distance + " meters");
    }
}
