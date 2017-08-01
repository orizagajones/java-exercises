package exercises;

import java.util.Scanner;

public class Alice {
    /* write a program that will search for a term within the first sentence of Alice in Wonderland
     and return a bool to confirm if the term can be found within the sentence. */
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String searchTerm;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println(firstSentence);
        System.out.println("Please enter a word to search for in the sentence.");
        searchTerm = next();

        firstSentence.toLowerCase();
        searchTerm.toLowerCase();
        if (firstSentence.contains(searchTerm)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}
