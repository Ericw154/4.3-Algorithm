import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Algorithms {
    private File file;

    // Constructor to initialize the file
    public Algorithms(File file) {
        this.file = file;
    }

    public int two() throws FileNotFoundException {
        Scanner s = new Scanner(file);
        int two = 0;
        while (s.hasNext()) {
            if (s.next().length() == 2) {
                two++;
            }
        }
        return two;
    }

    public int longest() throws FileNotFoundException {
        Scanner s = new Scanner(file);
        int num = 0;
        int length = 0;
        while (s.hasNext()) {
            String word = s.next(); 
            int wordLength = word.length();
            if (wordLength > length) {
                length = wordLength;
                num = 1; 
            } else if (wordLength == length) {
                num++; 
            }
        }
        return num;
    }


    public int pal() throws FileNotFoundException {
        Scanner s = new Scanner(file);
        int num = 0;
        while (s.hasNext()) {
            String word = s.next();
            if (isPal(word)) {
                num++;
            }
        }
        return num;
        
    }
    
    private boolean isPal(String word) {
        int left = 0;
        int right = word.length() - 1;
    
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
