package IuliaV.Library;

public class Novel extends Book{
    final String genre;
    public Novel(String name, int numberOfPages, String genre) {
        super(name, numberOfPages);
        this.genre = genre;
    }
}
