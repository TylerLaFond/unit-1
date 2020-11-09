package app;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) throws Exception {
    
        Scanner input = new Scanner(System.in);

        int correctNum = 49;
        boolean isComplete = false;

        while (isComplete == false)  {

            System.out.println("pick a number between 0 and 100");
            int pick = input.nextInt();
            input.nextLine();

            if (pick == correctNum) {
                System.out.println("Correct");
                isComplete = true;
            }

            else if (pick < correctNum) {
                System.out.println("Low");
            }

            else {
                System.out.println("High");
            }
        }

      
      }


      


    }

    
    