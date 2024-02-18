package ua.hillel.yatsenko.homeworks.HW6.Participants;

import ua.hillel.yatsenko.homeworks.HW6.Obstacles.*;

public class Human implements Participant
{
    private final String name;
    private final double maxRunDistance;
    private final double maxJumpHeight;
    private double currentDistance;

    public Human(String name, double maxRunDistance, double maxJumpHeight)
    {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        currentDistance = 0;
    }

    @Override
    public void run()
    {
        System.out.println("Людина \"" + name + "\" біжить.");
    }

    @Override
    public void jump()
    {
        System.out.println("Людина \"" + name + "\" стрибає.");
    }

    @Override
    public boolean overcome(Obstacle obstacle)
    {
        if (obstacle == null) return true;
        if (obstacle.overcome(this))
        {
            System.out.println("Людина \"" + name + "\" подолала перешкоду \"" + obstacle.getName() + "\".");
            currentDistance += obstacle.getOvercomeDistance();
            return true;
        }
        System.out.println("Людина \"" + name + "\" не подолала перешкоду \"" + obstacle.getName() + "\".");
        System.out.println("Пройдено " + currentDistance + " метрів");
        return false;
    }

    @Override
    public double getMaxRunDistance()
    {
        return maxRunDistance;
    }
    @Override
    public double getMaxJumpHeight()
    {
        return maxJumpHeight;
    }

    @Override
    public String getName()
    {
        return "Людина \"" + name + "\"";
    }
}
