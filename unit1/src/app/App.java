package app;

import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
      Scanner input = new Scanner(System.in);
      String  password = "11237!";
      int tries = 0;
      boolean secretPassword = false;

      while (tries < 3){
          if (secretPassword == false){
              System.out.println("please enter your password");
              String enteredPasswod = input.nextLine();

                if (enteredPasswod.equals(password)) {
                    System.out.println("Correct Password");
                    secretPassword = true ;
                }

                else {
                    System.out.println("wrong Password");
                    tries++;
                    System.out.println("you have " + (3 - tries) + " chances left");
                }
          }
          
      }

      if (tries == 3)  {
         System.out.println("out of attemps");
      }
     

      


    }
}
    
    