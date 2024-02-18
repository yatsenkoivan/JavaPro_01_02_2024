package ua.hillel.yatsenko.homeworks.HW6.Participants;

import ua.hillel.yatsenko.homeworks.HW6.Obstacles.Obstacle;

public interface Participant
{
    void run();
    void jump();
    //True if participant overcame obstacle
    boolean overcome(Obstacle obstacle);

    double getMaxRunDistance();
    double getMaxJumpHeight();

    String getName();
}
