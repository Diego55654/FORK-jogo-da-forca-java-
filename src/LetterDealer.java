import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import boneco.Toy;
import boneco.ToyBuilder;



public class LetterDealer {
    void guessLetter(String gameWord, int wordNumLetters, String hiddenWord, Toy toy) {

        Scanner scan = new Scanner(System.in); //Initiatize out from While loop 

	char[] ch = gameWord.toLowerCase().toCharArray();
        char[] chHidden = hiddenWord.toCharArray();
	
        List<String> wrongLetters = new ArrayList<>();
	int rightLetters = 0;
        int numTrys = 7;
	int erro = 0;

	boolean victory = false;
        char letter;
	 
        while (true) {
	
            boolean letterWasRight = false;

	  try{

            System.out.println("Chute uma letra: ");
            letter = scan.nextLine().toLowerCase().charAt(0);

		if(!checkInput(letter)){
			System.out.println("So aceitamos letras (a-Z)");
			continue;
		}
		
	  }
	  catch(StringIndexOutOfBoundsException e){
			System.out.println("Entrada Invalida. Digite uma letra (a-A)");
			continue;
		}
	  catch(Exception e){
			System.out.println("ERRO INESPERADO");
			continue;
		}

            for (int i = 0; i < ch.length; i++) {

		//Prevents counting the same correct letter twice

		if (ch[i] == letter) {
		    if(chHidden[i] == '_'){
                       chHidden[i] = letter;
                       rightLetters++;
		    }
		    letterWasRight = true;
		}
                System.out.print(chHidden[i] + " ");
            }

            if (!letterWasRight) {

		erro++;	
		toy.drawToy(erro);

	
		// CHAR -> STRING (letter value)
                String guessedInput = String.valueOf(letter);

		//User's trying enter a same letter of wrongList elements
                if (wrongLetters.contains(guessedInput)) {
                    System.out.println("\nOps, esta letra já foi escolhida: " + guessedInput);
                } else {
                    wrongLetters.add(guessedInput);
                    numTrys--;
                }
            }

            System.out.println("\nLetras erradas: " + String.join(", ", wrongLetters));
	if (numTrys  > 0 ){
        System.out.println("Você tem mais " + numTrys + " tentativas.");
	}
	    
	    if (rightLetters == wordNumLetters) {
		if (erro == 0){
		System.out.println("\nParabéns, você acertou a palavra sem um único erro!");
	        
		} else {
		System.out.println("\nParabéns, você acertou :)");
		}
		break;

            } if (numTrys <= 0) {
                System.out.println("\nPoxa, suas chances acabaram :(");
		break;
            }

        }	
    }
	private static boolean checkInput(char letter){
		return Character.isLetter(letter);
	}

}
