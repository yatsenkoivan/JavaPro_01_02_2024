package ua.hillel.yatsenko.homeworks.HW5.Observers;

public class AnimalObserver
{
    private int animalsCreated;

    public void animalCreated()
    {
        animalsCreated++;
    }

    public int getAnimalsCreated()
    {
        return animalsCreated;
    }
}
