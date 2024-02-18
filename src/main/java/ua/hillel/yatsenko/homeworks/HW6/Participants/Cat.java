package ua.hillel.yatsenko.homeworks.HW6.Participants;

import ua.hillel.yatsenko.homeworks.HW6.Obstacles.Obstacle;

public class Cat implements Participant
{
    private final String name;
    private final double maxRunDistance;
    private final double maxJumpHeight;
    private double currentDistance;

    public Cat(String name, double maxRunDistance, double maxJumpHeight)
    {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        currentDistance = 0;
    }

    @Override
    public void run()
    {
        System.out.println("Кіт \"" + name + "\" біжить.");
    }

    @Override
    public void jump()
    {
        System.out.println("Кіт \"" + name + "\" стрибає.");
    }

    @Override
    public boolean overcome(Obstacle obstacle)
    {
        if (obstacle == null) return true;
        if (obstacle.overcome(this))
        {
            System.out.println("Кіт \"" + name + "\" подолав перешкоду \"" + obstacle.getName() + "\".");
            currentDistance += obstacle.getOvercomeDistance();
            return true;
        }
        System.out.println("Кіт \"" + name + "\" не подолав перешкоду \"" + obstacle.getName() + "\".");
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
