import java.util.Scanner;
/**
 * Assigmment for testing Git
 * 
 * @author Jacob Wood
 * @version 08/25/24
 */
public class firstassignment {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to access information for the "
        + "2024 Mustang GT and 2 for the 2024 Mustang Darkhorse.");
        String info = scanner.nextLine();
        while (info != "1" || info != "2")
        {
            System.out.println("Re-enter a valid input, either 1 or 2");
            info = scanner.nextLine();
        }
        if (info == "1")
        {
            Scanner newScanner = new Scanner(System.in);
            System.out.println("Enter 1 for the price of the vehicle, " 
            + "or 2 for the horsepower");
            String choice = newScanner.nextLine();
            while (choice != "1" || info != "2")
            {
            System.out.println("Re-enter a valid input, either 1 or 2");
            choice = newScanner.nextLine();
            }
            if (choice == "1")
            {
                GT gtPrice = new GT();
                gtPrice.printPrice();
            }
            else
            {
                GT gtHP = new GT();
                gtHP.printHP();
            }
            newScanner.close();
        }
        else
        {
            Scanner anotherScanner = new Scanner(System.in);
            System.out.println("Enter 1 for the price of the vehicle, " 
            + "or 2 for the horsepower");
            String choice = anotherScanner.nextLine();
            while (choice != "1" || info != "2")
            {
            System.out.println("Re-enter a valid input, either 1 or 2");
            choice = anotherScanner.nextLine();
            }
            if (choice == "1")
            {
                Darkhorse dhPrice = new Darkhorse();
                dhPrice.printPrice();
            }
            else
            {
                Darkhorse dhHP = new Darkhorse();
                dhHP.printHP();
            }
            anotherScanner.close();
        }
        scanner.close();
    }

}

abstract class Mustang
{
    public abstract void printHP();
    public void printPrice()
    {
        System.out.println("The base model 2024 Mustang starts at $31,920!");
    }

}

class GT extends Mustang
{
    public void printHP()
    {
        System.out.println("The 2024 Mustang GT has 480 horsepower!");
    }
        public void printPrice()
    {
        System.out.println("The base model 2024 Mustang starts at $42,495!");
    }
    
}

class Darkhorse extends Mustang
{
    public void printHP()
    {
        System.out.println("The 2024 Mustang Darkhorse has 500 horsepower!");
    }
    public void printPrice()
    {
        System.out.println("The base model 2024 Mustang starts at $59,335!");
    }
}