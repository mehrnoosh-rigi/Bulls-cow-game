package bullscows;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10000);



        String player_1;
        player_1 = Integer.toString(randomNumber);

        System.out.println("The secret code is prepared: ****. ");

        System.out.println("Guess the 4 digits number: ");

        Scanner input = new Scanner(System.in);
        boolean found = false;
        while (!found){
            String player_2 = input.next();
            int cows = 0;
            int bulls = 0;
            for(int i = 0; i < 4; i++) {
                char digit = player_2.charAt(i);
                if(player_1.charAt(i) == digit) {
                    bulls++;
                }else if (player_1.indexOf(digit) > -1){
                    cows++;
                }
            }
            if(bulls == 4){
                found = true;
                System.out.println("Congrats");
            } else {
                System.out.println("bulls: "+ bulls + " and cows: "  + cows);
            }
        }
    }
}
