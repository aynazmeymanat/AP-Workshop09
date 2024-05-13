import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class FileAnalizer implements Runnable {
    private String name ;
    private  int wordCounter ;
    private  HashSet<String> word ;
    private  String maxWord ;
    private  String minWord ;
    private  int letterCounter ;

    public FileAnalizer(String name) {
        this.name = name ;
        wordCounter = 0 ;
        word = new HashSet<String>() ;
        letterCounter = 0 ;
    }

    public String getMaxWord() {
        return maxWord;
    }

    public void setMaxWord(String maxWord) {
        this.maxWord = maxWord;
    }

    public String getMinWord() {
        return minWord;
    }

    public void setMinWord(String minWord) {
        this.minWord = minWord;
    }

    public int getLetterCounter() {
        return letterCounter;
    }

    public void setLetterCounter(int letterCounter) {
        this.letterCounter = letterCounter;
    }

    public double average(){
        return letterCounter / wordCounter ;
    }

    @Override
    public void run() {
        File file = new File(name);
        synchronized (this) {

            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    String wordd = scanner.nextLine();
                    wordCounter++;

                    if (maxWord == null || wordd.length() > maxWord.length()) {
                        maxWord = wordd;
                    }

                    if (minWord == null || wordd.length() < minWord.length()) {
                        minWord = wordd;
                    }

                    word.add(wordd);
                    letterCounter += wordd.length();
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
    }

    public int numWord(){
        return word.size();
    }

}
