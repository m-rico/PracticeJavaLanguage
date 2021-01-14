package com.driko;

import java.util.Random;
import java.util.Scanner;

public class RiddleGames {

    public static void main(String[] args) {

        //Declarated Variable
        Scanner sysinptvlues;
        Random rndm;
        String playername, yesoryes;
        int kim, inptguess, rndmnmbr, pnts;


        System.out.printf("%n");
        System.out.println("\t+------------------------------+");
        System.out.println("\t| Welcome to The Riddle game ! |");
        System.out.println("\t+------------------------------+");
        System.out.printf("%n");

        sysinptvlues = new Scanner(System.in);

        System.out.print("Please Insert Your Nickname : ");
        playername = sysinptvlues.nextLine();

        System.out.printf("%n");
        System.out.println("Hai " + playername + " Are You Ready For play This game");
        System.out.printf("%n");
        System.out.println("Type yes or no with lowerr case");
        yesoryes = sysinptvlues.next();


        if (yesoryes.equals("yes")){

            System.out.printf("%n");
            System.out.println("\t+----------------------------------------------------------------------+");
            System.out.println("\t| Oke This is the rules of the game :                                  |");
            System.out.println("\t| System Will pick random Number and you must guess what the number is |");
            System.out.println("\t+----------------------------------------------------------------------+");
            System.out.println("\n");
            // create instance of Random class
            rndm = new Random();

            // Generate random integers in range 0 to 9 + 1 = 10
            rndmnmbr = rndm.nextInt(9 + 1);


            for (kim = 1; kim < 5 + 1; kim++){

                System.out.printf("question %d :", kim);
                System.out.println("\n");
                System.out.print("Whats Your Answer ? : ");
                inptguess = sysinptvlues.nextInt();

                if (inptguess == rndmnmbr){
                    System.out.println("\n");
                    System.out.println("Answer Correct");
                    System.out.println("\n");
                    break;
                } else if  (inptguess < rndmnmbr) {
                    System.out.println("Answer false : the number Higger than " + inptguess);
                    System.out.println("\n");
                } else {
                    System.out.println("Answer false : the number Lower than "+ inptguess);
                    System.out.println("\n");
                }

            }



                if (kim == 1){
                    System.out.println(" Wow Congratulation, you Can Answer the Guess with just One Chance ");
                } else if (kim == 2){
                    System.out.println(" Great ! Almost Perfect, You Right in the Second Chance  ");
                } else if (kim == 3){
                    System.out.println(" oke done ");
                } else if (kim == 4){
                    System.out.println(" oke done ");
                } else if (kim == 5){
                    System.out.println(" oke done ");
                } else {
                    System.out.println(" Sorry You Fail, Please Try Again And Don't Give UP, Just Fighting Queen !!!");
                }


            System.out.println("Game Over Queen");

        } else if (yesoryes.equals("no")){
            System.out.printf("%n");
            System.out.println("Ok No problem, Maybe Next Time ?!");
        } else {
            System.out.println("Sorry I don't Know What you mean ?!");
        }




    }
}
