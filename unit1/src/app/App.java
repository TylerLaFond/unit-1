package app;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) throws Exception {
    
        Scanner input = new Scanner(System.in);

        System.out.println("please enter a noun");
        String noun1 = input.nextLine();

        System.out.println("please enter a verb");
        String verb = input.nextLine();

        System.out.println("please enter a noun");
        String noun2 = input.nextLine();

        System.out.println("please enter s adjective");
        String adjective = input.nextLine();

        System.out.println("Please ente a adverb");
        String adverb = input.nextLine();



        System.out.println("there was a " + noun1 + " which was very " +  verb + ". there was a " + noun2 + " next to it which was " + adjective + " than the other. Althought they were both " + adverb);
        


      
      }


      


    }

    
    