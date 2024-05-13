import java.util.HashSet;

public class FileAnalizer {
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
}
