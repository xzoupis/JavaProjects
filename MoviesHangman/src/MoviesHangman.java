import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.Collections;

public class MoviesHangman {

    public static void main(String [] args) throws Exception{

        String[] movies = new String[26];
        String word;
        char WrongLetter[] = new char[10];
        int WrongGuesses = 0;
        Boolean WordGuess = false;
        Scanner scanner = new Scanner(System.in);

        movies = GetMovies("movies.txt");

        int randomNumber = (int) (Math.random() * movies.length);
        String ChosenWord = movies[randomNumber];
        System.out.println(ChosenWord);

        word = HideTitle(ChosenWord);

        String w=word;
        String CWNS = ChosenWord.replaceAll("\\s+","");
        String CW=CWNS.toLowerCase();

        while (WrongGuesses < 10 && word.contains("_")) {
            WordGuess = false;
            System.out.println("You are guessing: " + word);
            System.out.println("You have guessed " + WrongGuesses + " wrong letters:");
            System.out.println("Guess a letter: ");
            String guess = scanner.next();
            char c = guess.charAt(0);

            for (int i = -1; (i = CW.indexOf(c, i)) != -1; i++) {
                //System.out.println(i);
                WordGuess = true;
                int pos = w.indexOf('_');
                int count=0;
                while (count != i && pos >= 0) {
                    pos = w.indexOf('_', pos + 1);
                    //System.out.println(pos);
                    count++;
                }


                char[] charArray = word.toCharArray();
                charArray[pos] = CWNS.charAt(i);
                word = String.copyValueOf(charArray);
            }

            if (!WordGuess) {
                if (new String(WrongLetter).indexOf(c) == -1){
                    WrongLetter[WrongGuesses] = c;
                    WrongGuesses++;

                }

            }

        }
        if (WrongGuesses < 10){
            System.out.println("Congratulations! You found the word: " + ChosenWord);
        }
        else{
            System.out.println("Too bad! You lost. Maybe next time :)");
            System.out.println("The word was: " + ChosenWord);
        }
    }


    private static String[] GetMovies(String title) throws FileNotFoundException {
        File file = new File(title);
        String[] line = new String[26];
        Scanner fileScanner = new Scanner(file);
        int i = 0;
        while (fileScanner.hasNextLine()) {
            line[i] = fileScanner.nextLine();
            i++;
        }
        return line;
    }

    private static String HideTitle(String SelectedTitle) throws FileNotFoundException {

        String[] word = SelectedTitle.split(" ");
        String HiddenWord = "";
        for (int i=0; i<word.length; i++) {
            HiddenWord = HiddenWord +  String.join(" ", Collections.nCopies(word[i].length(), "_")) + "   ";
        }
        return HiddenWord;
    }
}


