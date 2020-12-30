public class LibraryProject {
    public static void main(String[] args) {

        Library library1 = new Library();

        library1.addBook(new Book("100 Hikes in Northwest Oregon", "William L. Sullivan", 256, 2, 0));
        library1.addBook(new Book().read());  //read in a new book into the library

        library1.displayAll();

    }
}
