package ua.hillel.yatsenko.homeworks.HW6.Obstacles;

import ua.hillel.yatsenko.homeworks.HW6.Participants.Participant;

public class Racetrack implements Obstacle
{
    private final double length;
    public Racetrack(double length)
    {
        this.length = length;
    }

    public double getLength()
    {
        return length;
    }

    @Override
    public boolean overcome(Participant participant)
    {
        if (participant == null) return true;
        participant.run();
        return (participant.getMaxRunDistance() >= getLength());
    }
    @Override
    public String getName()
    {
        return "Бігова доріжка";
    }

    @Override
    public double getOvercomeDistance() {
        return length;
    }
}
