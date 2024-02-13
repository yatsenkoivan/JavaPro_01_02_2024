package ua.hillel.yatsenko.homeworks.HW5.Animals;


import ua.hillel.yatsenko.homeworks.HW5.Observers.AnimalObserver;

abstract public class Animal
{
    abstract public void run(double distance);
    abstract public void swim(double distance);

    public Animal(AnimalObserver... observers)
    {
        for (AnimalObserver observer : observers)
        {
            observer.animalCreated();
        }
    }

}
