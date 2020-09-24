package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner input = new Scanner(System.in);

      System.out.println("please enter your name");
      String FirstName = input.nextLine();
      System.out.println("please enter your last name");
      String LastName = input.nextLine();
      System.out.println("please enter your grade");
      String Grade = input.nextLine();
      System.out.println("please enter your age");
      String Age = input.nextLine();
      System.out.println("Please enter your favriote color");
      String FavColor = input.nextLine();

      System.out.println("hello,  " + FirstName + LastName);
      System.out.println("you are in grade  " + Grade);
      System.out.println("you are " + Age + "years old");
      System.out.println("your favriote color is " + FavColor);

    }
}