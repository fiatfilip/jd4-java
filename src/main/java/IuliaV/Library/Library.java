package IuliaV.Library;

public class Library {
    public static void main(String[] args) {
        Catalog libraryCatalog = new Catalog(5);
        //init books
        Novel novel1 = new Novel("The Foundation Trilogy",607, "SciFi");
        Novel novel2 = new Novel("Foundation's Edge",413, "SciFi");
        Novel novel3 = new Novel("The Institute",625, "Thriller");
        ArtAlbum album1 = new ArtAlbum("Dali - The Paintings", 752, ArtAlbum.Quality.GOOD);
        ArtAlbum album2 = new ArtAlbum("Kakemono", 208, ArtAlbum.Quality.PRISTINE);
        libraryCatalog.addBook(novel1);
        libraryCatalog.addBook(novel2);
        libraryCatalog.addBook(novel3);
        libraryCatalog.deleteBook("The Foundation Trilogy");
        libraryCatalog.addBook(album1);
        libraryCatalog.addBook(album2);
        libraryCatalog.listBooks();
        libraryCatalog.deleteBook("Kakemono");
        libraryCatalog.listBooks();
        libraryCatalog.deleteBook("Dali - The Paintings");
        libraryCatalog.listBooks();

    }
}
