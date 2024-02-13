package ua.hillel.yatsenko.homeworks.HW5.Animals;

import ua.hillel.yatsenko.homeworks.HW5.Observers.AnimalObserver;

public class Cat extends Animal
{
    public static final double MAX_RUN_DISTANCE = 200;
    public static final double MAX_SWIM_DISTANCE = 0;

    public Cat(AnimalObserver... observers)
    {
        super(observers);
    }

    @Override
    public void run(double distance)
    {
        if (distance <= MAX_RUN_DISTANCE)
        {
            System.out.println("Cat ran " + distance + " meters");
            return;
        }
        System.out.println("Cat can't run " + distance + " meters");
    }

    @Override
    public void swim(double distance)
    {
        if (distance <= MAX_SWIM_DISTANCE)
        {
            System.out.println("Cat swam " + distance + " meters");
            return;
        }
        System.out.println("Cat can't swim " + distance + " meters");
    }

}
