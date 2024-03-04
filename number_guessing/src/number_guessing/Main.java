package number_guessing;

import java.util.Scanner;

public class Main {
	// Função que implementa
    // o jogo de adivinhe o número.
	// Versão em inglês.
    public static void
    guessingNumberGame()
    {
        // Classe do Scanner
        Scanner sc = new Scanner(System.in);
 
        // Gerador de números
        int number = 1 + (int)(100
                               * Math.random());
 
        // Número de tentativas são 5
        int K = 5;
 
        int i, guess;
 
        System.out.println(
            "A number is chosen"
            + " between 1 to 100."
            + "Guess the number"
            + " within 5 trials.");
 
       
        for (i = 0; i < K; i++) {
 
            System.out.println(
                "Guess the number:");
 
            
            guess = sc.nextInt();
 
            // Se acertou o número
            if (number == guess) {
                System.out.println(
                    "Congratulations!"
                    + " You guessed the number.");
                break;
            }
            else if (number > guess
                     && i != K - 1) {
                System.out.println(
                    "The number is "
                    + "greater than " + guess);
            }
            else if (number < guess
                     && i != K - 1) {
                System.out.println(
                    "The number is"
                    + " less than " + guess);
            }
        }
 
        if (i == K) {
            System.out.println(
                "You have exhausted"
                + " K trials.");
 
            System.out.println(
                "The number was " + number);
        }
    }
 
  
    public static void
    main(String arg[])
    {
 
       
        guessingNumberGame();
    }
}