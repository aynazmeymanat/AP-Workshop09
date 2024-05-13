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


}
