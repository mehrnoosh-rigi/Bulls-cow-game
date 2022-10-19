package bullscows;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10000);

        int cows = 0;
        int bulls = 0;

        String player_1;
        player_1 = Integer.toString(randomNumber);

        System.out.println(
                "The random number is generated: " + randomNumber);

        System.out.println("Guess the 4 digits number: ");

        Scanner input = new Scanner(System.in);

        String player_2 = input.next();
        for(int i = 0; i < 4; i++) {
            char digit = player_2.charAt(i);
            if(player_1.charAt(i) == digit) {
                bulls++;
            }else if (player_1.indexOf(digit) > -1){
                cows++;
            }
        }
        if(bulls == 4){
            System.out.println("Congrats");
        } else {
            System.out.println("bulls: "+ bulls + " and cows: "  + cows);
        }
    }
}
