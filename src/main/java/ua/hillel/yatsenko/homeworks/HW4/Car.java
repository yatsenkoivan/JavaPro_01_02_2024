package ua.hillel.yatsenko.homeworks.HW4;

public class Car
{
    public void start()
    {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    public void startElectricity()
    {
        System.out.println("Started electricity");
    }

    public void startCommand()
    {
        System.out.println("Started command");
    }

    public void startFuelSystem()
    {
        System.out.println("Started fuel system");
    }
}
