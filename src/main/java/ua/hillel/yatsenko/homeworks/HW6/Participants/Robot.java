package ua.hillel.yatsenko.homeworks.HW6.Participants;

import ua.hillel.yatsenko.homeworks.HW6.Obstacles.Obstacle;

public class Robot implements Participant
{
    private final String name;
    private final double maxRunDistance;
    private final double maxJumpHeight;
    private double currentDistance;
    public Robot(String name, double maxRunDistance, double maxJumpHeight)
    {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        currentDistance = 0;
    }
    @Override
    public void run()
    {
        System.out.println("Робот \"" + name + "\" біжить.");
    }

    @Override
    public void jump()
    {
        System.out.println("Робот \"" + name + "\" стрибає.");
    }

    @Override
    public boolean overcome(Obstacle obstacle)
    {
        if (obstacle == null) return true;
        if (obstacle.overcome(this))
        {
            System.out.println("Робот \"" + name + "\" подолав перешкоду \"" + obstacle.getName() + "\".");
            currentDistance += obstacle.getOvercomeDistance();
            return true;
        }
        System.out.println("Робот \"" + name + "\" не подолав перешкоду \"" + obstacle.getName() + "\".");
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
