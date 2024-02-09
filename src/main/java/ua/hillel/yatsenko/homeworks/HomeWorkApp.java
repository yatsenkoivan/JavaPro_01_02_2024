package ua.hillel.yatsenko.homeworks;

public class HomeWorkApp
{
    public static void main(String[] args)
    {
        HomeWorkApp main = new HomeWorkApp();

        main.printThreeWords();
        main.checkSumSign();
        main.printColor();
        main.compareNumbers();
        System.out.println(main.checkSum(5, 5));
        main.checkSign(-5);
        System.out.println(main.isNegative(5));
        main.printMultipleTimes("Hello", 5);
        System.out.println(main.isLeapYear(2020));

    }

    private void printThreeWords()
    {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private void checkSumSign()
    {
        int a = 10;
        int b = 20;
        int sum = a + b;

        if (isNegative(sum))
        {
            System.out.println("Сума негативна");
        }
        else
        {
            System.out.println("Сума позитивна");
        }

    }

    private void printColor()
    {
        int value = 100;
        if (value <= 0)
        {
            System.out.println("Червоний");
            return;
        }
        if (value <= 100)
        {
            System.out.println("Жовтий");
            return;
        }
        System.out.println("Зелений");
    }

    private void compareNumbers()
    {
        int a = 10;
        int b = 20;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }

    private boolean checkSum(int number1, int number2)
    {
        int sum = number1 + number2;
        return sum >= 10 && sum <= 20;
    }

    private void checkSign(int number)
    {
        if (isNegative(number))
        {
            System.out.println("Число від'ємне");
        }
        else
        {
            System.out.println("Число додатнє");
        }
    }

    private boolean isNegative(int number)
    {
        return number < 0;
    }

    private void printMultipleTimes(String text, int count)
    {
        for (int i = 0; i < count; i++)
        {
            System.out.println(text);
        }
    }

    private boolean isLeapYear(int year)
    {
        if (year % 100 == 0)
        {
            return year % 400 == 0;
        }
        return year % 4 == 0;
    }

}
