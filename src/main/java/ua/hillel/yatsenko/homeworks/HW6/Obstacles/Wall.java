package ua.hillel.yatsenko.homeworks.HW6.Obstacles;

import ua.hillel.yatsenko.homeworks.HW6.Participants.Participant;

public class Wall implements Obstacle
{
    private final double height;
    public Wall(double height)
    {
        this.height = height;
    }

    public double getHeight()
    {
        return height;
    }

    @Override
    public boolean overcome(Participant participant)
    {
        if (participant == null) return true;
        participant.jump();
        return (participant.getMaxJumpHeight() >= getHeight());
    }
    @Override
    public String getName()
    {
        return "Стіна";
    }

    @Override
    public double getOvercomeDistance() {
        return 1;
    }
}
