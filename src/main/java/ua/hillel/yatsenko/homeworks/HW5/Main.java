package ua.hillel.yatsenko.homeworks.HW5;

import ua.hillel.yatsenko.homeworks.HW5.Animals.Cat;
import ua.hillel.yatsenko.homeworks.HW5.Animals.Dog;
import ua.hillel.yatsenko.homeworks.HW5.Observers.AnimalObserver;

public class Main
{
    public static void main(String[] args)
    {
        AnimalObserver catObserver = new AnimalObserver();
        AnimalObserver dogObserver = new AnimalObserver();
        AnimalObserver totalObserver = new AnimalObserver();

        Cat cat1 = new Cat(catObserver, totalObserver);
        Cat cat2 = new Cat(catObserver, totalObserver);
        Dog dog1 = new Dog(dogObserver, totalObserver);
        Dog dog2 = new Dog(dogObserver, totalObserver);
        Dog dog3 = new Dog(dogObserver, totalObserver);

        cat1.run(100);
        cat1.swim(10);
        cat2.run(200);
        cat2.swim(20);
        dog1.run(400);
        dog1.swim(5);
        dog2.run(600);
        dog2.swim(15);
        dog3.run(700);
        dog3.swim(20);

        System.out.println("Cats created: " + catObserver.getAnimalsCreated());
        System.out.println("Dogs created: " + dogObserver.getAnimalsCreated());
        System.out.println("Total animals created: " + totalObserver.getAnimalsCreated());

    }
}
