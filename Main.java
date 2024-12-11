import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File wordsFile = new File("words.txt");
        Algorithms algorithms = new Algorithms(wordsFile);
        System.out.println("Number of two letter words: " + algorithms.two());
        System.out.println("Number of words that are tied for longest word: " + algorithms.longest());
        System.out.println("Number of words that are palindromes: " + algorithms.pal());
    }
}
