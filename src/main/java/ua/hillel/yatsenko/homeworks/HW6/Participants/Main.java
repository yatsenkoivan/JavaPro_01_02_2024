package ua.hillel.yatsenko.homeworks.HW6.Participants;

import ua.hillel.yatsenko.homeworks.HW6.Obstacles.*;

public class Main
{
    public static void main(String[] args)
    {
        Participant[] participants = new Participant[3];
        Obstacle[] obstacles = new Obstacle[8];

        participants[0] = new Human("human_name", 1000, 2);
        participants[1] = new Cat("cat_name", 500, 3);
        participants[2] = new Robot("robot_name", 1500, 1);

        obstacles[0] = new Wall(1);
        obstacles[1] = new Racetrack(100);
        obstacles[2] = new Wall(2);
        obstacles[3] = new Racetrack(500);
        obstacles[4] = new Wall(3);
        obstacles[5] = new Racetrack(1000);
        obstacles[6] = new Wall(4);
        obstacles[7] = new Racetrack(1500);

        for (Participant participant : participants)
        {
            System.out.println("Учасник: " + participant.getName());
            for (Obstacle obstacle : obstacles)
            {
                if (!participant.overcome(obstacle))
                {
                    break;
                }
            }
            System.out.println("---------------------------------");
        }

    }
}
