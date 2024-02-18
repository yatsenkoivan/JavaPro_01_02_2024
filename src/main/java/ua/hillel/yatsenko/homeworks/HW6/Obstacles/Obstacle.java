package ua.hillel.yatsenko.homeworks.HW6.Obstacles;

import ua.hillel.yatsenko.homeworks.HW6.Participants.Participant;

public interface Obstacle
{
    boolean overcome(Participant participant);

    String getName();

    double getOvercomeDistance();
}
