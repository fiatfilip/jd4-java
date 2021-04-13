package IuliaV.Library;

public class Catalog {
    private int length;
    private int index = 0;
    public Book[] catalogList;
    public Catalog(int length) {
        this.length = length;
        this.catalogList = new Book[length];
    }

    public void addBook(Book book) {
        catalogList[index] = book;
        index++;
    }

    public void deleteBook(String name) {
        if (index<this.length) {
            System.out.println("Please finish adding all stated books in the catalog.");
            return;
        }
        // I have looked for ways to manipulate arrays but I must have failed;
        // it can't be this difficult/messy to remove an array element, please advise
        Book[] copyArray = new Book[this.length-1];
        int j = 0;
        for (int i=0; i < this.length-1; i++) {
            if (!this.catalogList[i].name.equals(name)) {
                copyArray[j] = this.catalogList[i];
                j++;
            }
        }
        this.catalogList = copyArray;
        this.length = j;
    }

    public void listBooks() {
        if (index<this.length) {
            System.out.println("Please finish adding all stated books in the catalog.");
            return;
        }
        System.out.println("Total of " + this.catalogList.length + " books are:");
        for(int i=0; i<this.catalogList.length; i++) {
            System.out.println(this.catalogList[i].name);
        }
    }
}
